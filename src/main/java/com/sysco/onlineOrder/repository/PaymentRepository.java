package com.sysco.onlineOrder.repository;

import com.sysco.onlineOrder.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Integer> , CrudRepository<Payment,Integer> {
    @Transactional
    @Modifying
    @Query("FROM Payment")
    List<Payment> findAllPayment();

    @Transactional
    @Modifying
    @Query(value = " FROM Payment WHERE invoiceNo =?1")
    Payment findByPaymentId(int invoiceNo);


}


