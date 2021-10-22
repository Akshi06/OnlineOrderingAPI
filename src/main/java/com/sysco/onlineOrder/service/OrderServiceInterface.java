package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Order;

import java.util.List;

public interface OrderServiceInterface {
    List<Order> getAllOrder();

    List<Order> add(Order order);

    List<Order> getOrderId(int OrderId);


}
