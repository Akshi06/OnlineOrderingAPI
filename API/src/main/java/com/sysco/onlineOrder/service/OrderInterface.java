package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Order;

import java.util.List;

public interface OrderInterface {
    List<Order> getAllOrder();

    Order addTheOrder(Order order);

    Order getOrderId(Integer OrderId);


}
