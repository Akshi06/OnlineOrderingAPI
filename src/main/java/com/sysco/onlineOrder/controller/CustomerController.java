package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Customer;
import com.sysco.onlineOrder.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/online-order"})
public class CustomerController {
    @Autowired
    private CustomerServiceInterface customerServiceInterface;

    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> getAllCustomer() {
        List<Customer> customers = null;

        try {
            customers = customerServiceInterface.getAllCustomer();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Customer> getIdCustomer(@PathVariable("id") int customerId) {
        Customer customer = null;
        try {
            customer = customerServiceInterface.getIdCustomer(customerId);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

    @PostMapping("/add/customer")
    public ResponseEntity<Customer> add(@RequestBody Customer cus){
        Customer customer =null;
        try{
            customer = customerServiceInterface.add(cus);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Customer>(customer,HttpStatus.OK);
    }

}
