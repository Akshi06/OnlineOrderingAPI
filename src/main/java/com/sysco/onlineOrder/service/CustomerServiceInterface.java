package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Customer;


import java.util.List;

public interface CustomerServiceInterface {
    public List<Customer> getAllCustomer();
    public Customer getIdCustomer(int id);
    public Customer update(Customer customer );
    public Customer deleteCustomer(int id);
}
