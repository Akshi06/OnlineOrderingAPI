package com.sysco.onlineOrder.repository;

import com.sysco.onlineOrder.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Transactional
    @Modifying
    @Query("FROM Order")
    List<Order> findAll();

    @Transactional
    @Modifying
    @Query(value = " FROM Order WHERE orderId =?1")
    Order findById(int orderId);


}

