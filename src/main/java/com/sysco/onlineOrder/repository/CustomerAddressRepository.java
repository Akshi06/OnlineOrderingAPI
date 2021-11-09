package com.sysco.onlineOrder.repository;


import com.sysco.onlineOrder.entity.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Integer>, CrudRepository<CustomerAddress, Integer> {

    @Transactional
    @Modifying
    @Query("FROM Customer")
    List<CustomerAddress> findAllAddress();

    @Transactional
    @Modifying
    @Query("FROM CustomerAddress WHERE cusAddressId = ?1")
    List<CustomerAddress> findByAddress(int id);

}
