package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Order;
import com.sysco.onlineOrder.service.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/v1/online-order"})
public class OrderController {

    @Autowired
    private OrderServiceInterface orderServiceInterface;

    @GetMapping("/order")
    public ResponseEntity<List<Order>> getAllOrder() {
        List<Order> orders = null;
        try {
            orders = orderServiceInterface.getAllOrder();
        } catch (Exception ex) {
            ex.getMessage();
        }

        return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
    }

    @PostMapping("/order")
    public ResponseEntity<Order> add(@RequestBody Order order) {
        Order order1 = null;
        try {
            order1 = orderServiceInterface.add(order);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Order>(order1, HttpStatus.OK);
    }
}
