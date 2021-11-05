package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Customer;
import com.sysco.onlineOrder.entity.Order;
import com.sysco.onlineOrder.service.CustomerInterface;
import com.sysco.onlineOrder.service.OrderInterface;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderInterface orderInterface;

    @Autowired
    private CustomerInterface customerInterface;


    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrder() {
        List<Order> orders = null;
        try {
            orders = orderInterface.getAllOrder();
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }

        return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
    }



    /**
     * add the order
     *
     * @param cusId cusId
     * @return {@link ResponseEntity}
     * @see ResponseEntity
     * @see List
     */
    @RequestMapping(
            value = "/orders/{cusId}",
            produces = "application/json",
            method = RequestMethod.POST)

//    @PostMapping("/orders/{cusId}")
//    @ResponseBody
    public ResponseEntity <Order> addTheOrder(@RequestParam(required = false) int cusId) {

//        take customerId
        Customer customer = (Customer) customerInterface.getCustomerById(cusId);

        Order PlaceOrder = null;
        Order order = new Order();

//        generator the order date
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);


        order.setCustomer(customer);
        order.setOrderDate(date);

        try {
            PlaceOrder = orderInterface.addTheOrder(order);
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity <Order> (PlaceOrder, HttpStatus.OK);
    }
}
