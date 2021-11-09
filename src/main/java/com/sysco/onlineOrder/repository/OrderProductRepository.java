package com.sysco.onlineOrder.repository;

import com.sysco.onlineOrder.entity.OrderProduct;
import org.springframework.data.repository.CrudRepository;


public interface OrderProductRepository extends CrudRepository<OrderProduct, Integer> {
//    @Transactional
//    @Modifying
//    @Query("FROM OrderProduct")
//    List<OrderProduct> findAll();

//    @Transactional
//    @Modifying
//    @Query(value = " FROM OrderProduct WHERE order_product_id =?")
//    OrderProduct findById(int id);


}
