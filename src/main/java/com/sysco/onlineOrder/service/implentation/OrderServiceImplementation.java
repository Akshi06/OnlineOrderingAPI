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

    /**
     * @return
     */

    @Override
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    /**
     * save the data in db
     *
     * @param order
     * @return
     */

    @Override
    public List<Order> add(Order order) {
        return (List<Order>) orderRepository.save(order);
    }

    /**
     * take orders using order id
     *
     * @param OrderId
     * @return
     */

    @Override
    public List<Order> getOrderId(int OrderId) {
        return orderRepository.findById(OrderId);
    }
}
