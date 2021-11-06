package com.sysco.onlineOrder.repository;

import com.sysco.onlineOrder.entity.Customer;
import com.sysco.onlineOrder.entity.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface OrderProductRepository extends JpaRepository<OrderProduct, Integer> , CrudRepository<OrderProduct, Integer> {
    @Transactional
    @Modifying
    @Query("FROM OrderProduct")
    List<OrderProduct> findAll();

//    @Transactional
//    @Modifying
//    @Query(value = " FROM OrderProduct WHERE order_product_id =?")
//    OrderProduct findById(int id);


}
