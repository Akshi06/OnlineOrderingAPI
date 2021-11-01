package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Customer;

import java.util.List;

public interface CustomerInterface {
    List<Customer> getAllCustomer();

    Customer getCustomerById(int id);

    Customer addTheCustomer(Customer customers);

    Customer deleteCustomer(int id);
}
