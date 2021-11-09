package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.entity.Order;
import com.sysco.onlineOrder.repository.OrderRepository;
import com.sysco.onlineOrder.service.OrderInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderImplementation implements OrderInterface {

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
     * add the order
     *
     * @param order order
     * @return {@link List}
     * @see List
     * @see Order
     */
    @Override
    public Order addTheOrder(Order order) {
        return orderRepository.save(order);
    }


    /**
     * take orders using order id
     *
     * @param OrderId OrderId
     * @return {@link List}
     * @see List
     * @see Order
     */

    @Override
    public Order getOrderId(Integer OrderId) {

        return orderRepository.getById(OrderId);
    }
}
