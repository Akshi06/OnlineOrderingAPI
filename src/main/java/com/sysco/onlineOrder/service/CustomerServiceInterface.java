package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Customer;

import java.util.List;

public interface CustomerServiceInterface {
    List<Customer> getAllCustomer();

    Customer getIdCustomer(int id);

    Customer update(Customer customers);

    Customer deleteCustomer(int id);
}
