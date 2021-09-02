package com.sysco.onlineOrder.service;


import com.sysco.onlineOrder.entity.Order;

import java.util.List;

public interface OrderServiceInterface {
    public List<Order> getAllOrder();
    public Order add(Order order);
}
