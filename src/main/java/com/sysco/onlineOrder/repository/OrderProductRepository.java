package com.sysco.onlineOrder.repository;

import com.sysco.onlineOrder.entity.OrderProduct;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, Integer> {
}
