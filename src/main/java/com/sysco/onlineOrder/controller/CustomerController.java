package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Customer;
import com.sysco.onlineOrder.service.CustomerInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping({"/v1/online-order"})
public class CustomerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerInterface customerInterface;


    /**
     * get all customers
     *
     * @return {@link ResponseEntity}
     * @see ResponseEntity
     * @see List
     */
    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = null;
        try {
            customers = customerInterface.getAllCustomer();
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }



    /**
     * get customer by id
     *
     * @param customerId customerId
     * @return {@link ResponseEntity}
     * @see ResponseEntity
     */
    @GetMapping("customer/{id}")
    public ResponseEntity <Customer> getCustomerById(@PathVariable("id") int customerId) {
        Customer customers = null;
        try {
            customers = customerInterface.getCustomerById(customerId);
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity <Customer> (customers, HttpStatus.OK);
    }

    /**
     * add the customer
     *
     * @param cus cus
     * @return {@link ResponseEntity}
     * @see ResponseEntity
     * @see Customer
     */
    @PostMapping("/customer")
    public ResponseEntity<Customer> addTheCustomer(@RequestBody Customer cus) {
        Customer customer = null;

        try {
            customer = customerInterface.addTheCustomer(cus);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

}
