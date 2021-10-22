package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Customer;

import java.util.List;

public interface CustomerServiceInterface {
    List<Customer> getAllCustomer();

    List<Customer> getIdCustomer(int id);

    Customer add(Customer customers);

    List<Customer> deleteCustomer(int id);
}
