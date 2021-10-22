package com.sysco.onlineOrder.repository;

import com.sysco.onlineOrder.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Transactional
    @Modifying
    @Query("FROM Customer")
    List<Customer> findAll();

    @Transactional
    @Modifying
    @Query(value = " FROM Customer WHERE cusId =?1")
    List<Customer> findById(int id);

    @Modifying
    @Query(value = "DELETE FROM Customer WHERE cusId =?1")
    List<Customer> deleteById(int id);

}
