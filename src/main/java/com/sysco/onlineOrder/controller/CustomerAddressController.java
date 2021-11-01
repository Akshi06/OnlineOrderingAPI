package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.CustomerAddress;
import com.sysco.onlineOrder.service.CustomerAddressInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping({"/v1/online-order"})
public class CustomerAddressController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerAddressController.class);

    @Autowired
    private CustomerAddressInterface customerAddressInterface;

    /**
     * get customer address by id
     *
     * @param cusAddressId customerAddress_id
     * @return {@link ResponseEntity}
     * @see ResponseEntity
     * @see CustomerAddress
     */
    @GetMapping("customer-address/{cusAddressId}")
    @ResponseBody
    public ResponseEntity<CustomerAddress> getCustomerAddressById(@PathVariable("cusAddressId") int cusAddressId) {
        CustomerAddress customerAddress = null;
        try {
            customerAddress = customerAddressInterface.getCustomerAddressById(cusAddressId);
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity <CustomerAddress> (customerAddress, HttpStatus.OK);
    }

    @PostMapping("/customer-address")
    @ResponseBody
    public ResponseEntity<CustomerAddress> addTheCustomerAddress(@RequestBody  CustomerAddress customerAddress) {
        CustomerAddress customerAddress1 = null;

        try {
            customerAddress1 = customerAddressInterface.addTheCustomerAddress(customerAddress);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<CustomerAddress>(customerAddress1, HttpStatus.OK);
    }

}
