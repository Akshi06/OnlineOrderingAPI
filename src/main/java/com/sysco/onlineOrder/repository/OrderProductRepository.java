package com.sysco.onlineOrder.repository;

import com.sysco.onlineOrder.entity.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface OrderProductRepository extends JpaRepository<OrderProduct, Integer> {
    @Transactional
    @Modifying
    @Query("FROM OrderProduct")
    List<OrderProduct> findAll();

    @Transactional
    @Modifying
    @Query(value = " FROM OrderProduct WHERE orderProductId =?1")
    List<OrderProduct> findById(int orderProductId);


}
