package com.sysco.onlineOrder.repository;

import com.sysco.onlineOrder.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order , Integer> {

}
