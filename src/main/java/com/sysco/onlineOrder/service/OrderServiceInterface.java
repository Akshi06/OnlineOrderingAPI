package com.sysco.onlineOrder.service;


import com.sysco.onlineOrder.entity.Order;

import java.util.List;

public interface OrderServiceInterface {
    List<Order> getAllOrder();

    Order add(Order order);
}
