package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.OrderProduct;
import com.sysco.onlineOrder.service.OrderProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/v1/online-order"})
public class OrderProductController {

    @Autowired
    private OrderProductServiceInterface orderProductServiceInterface;

    @GetMapping("/order-product")
    public ResponseEntity<List<OrderProduct>> getAllOrderProduct() {
        List<OrderProduct> orderProduct = null;
        try {
            orderProduct = orderProductServiceInterface.getAllOrderProduct();
        } catch (Exception ex) {
            ex.getMessage();
        }

        return new ResponseEntity<List<OrderProduct>>(orderProduct, HttpStatus.OK);
    }

    @PostMapping("/orderProduct")
    public ResponseEntity<OrderProduct> add(@RequestBody OrderProduct orderProduct) {
        OrderProduct orderProduct1 = null;
        try {
            orderProduct1 = orderProductServiceInterface.add(orderProduct1);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<OrderProduct>(orderProduct1, HttpStatus.OK);
    }
}
