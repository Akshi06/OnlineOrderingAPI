package com.sysco.onlineOrder.repository;

import com.sysco.onlineOrder.entity.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
