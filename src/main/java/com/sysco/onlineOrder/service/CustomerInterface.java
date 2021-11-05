package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Customer;

import java.util.List;

public interface CustomerInterface {
    List<Customer> getAllCustomer();

    List<Customer> getCustomerById(int cusId);

    Customer addTheCustomer(Customer customers);



}
