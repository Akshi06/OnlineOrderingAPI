package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.entity.Order;
import com.sysco.onlineOrder.repository.OrderRepository;
import com.sysco.onlineOrder.service.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImplementation implements OrderServiceInterface {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrder() {
        return (List<Order>) orderRepository.findAll();
    }

    @Override
    public Order add(Order order) {
        return orderRepository.save(order);
    }
}
