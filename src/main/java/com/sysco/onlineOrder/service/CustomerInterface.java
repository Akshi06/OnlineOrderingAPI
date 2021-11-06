package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerInterface {
    List<Customer> getAllCustomer();

   Customer getCustomerById(int cusId);

    Customer addTheCustomer(Customer customers);



}
