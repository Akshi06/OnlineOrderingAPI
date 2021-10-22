package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Customer;
import com.sysco.onlineOrder.entity.Order;
import com.sysco.onlineOrder.service.CustomerServiceInterface;
import com.sysco.onlineOrder.service.OrderServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping({"/v1/online-order"})

public class OrderController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private OrderServiceInterface orderServiceInterface;
    @Autowired
    private CustomerServiceInterface customerServiceInterface;

    @GetMapping("/orders")
//    take all order
    public ResponseEntity<List<Order>> getAllOrder() {
        List<Order> orders = null;
        try {
            orders = orderServiceInterface.getAllOrder();
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }

        return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
    }


    /**
     * post the data in to database
     * generator the date
     *
     * @param cusId
     * @return
     */

    @PostMapping("/orders")
    @ResponseBody
    public ResponseEntity<List<Order>> add(@RequestParam(required = false) int cusId) {

//        take customerId
        Customer customer = (Customer) customerServiceInterface.getIdCustomer(cusId);

        List<Order> PlaceOrder = null;
        Order order = new Order();

//        generator the order date
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);


        order.setCustomer(customer);
        order.setOrderDate(date);

        try {
            PlaceOrder = orderServiceInterface.add(order);
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity<List<Order>>(PlaceOrder, HttpStatus.OK);
    }
}
