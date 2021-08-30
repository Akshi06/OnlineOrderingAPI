package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Customer;
import com.sysco.onlineOrder.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/online-order"})
public class CustomerController {
    @Autowired
     private CustomerServiceInterface cusServiceInterface;

    @GetMapping("/version")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        List<Customer> customers = null;

        try {
            customers = cusServiceInterface.getAllCustomer();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
    }

}
