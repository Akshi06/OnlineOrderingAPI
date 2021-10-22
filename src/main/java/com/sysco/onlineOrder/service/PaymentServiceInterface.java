package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Payment;

import java.util.List;

public interface PaymentServiceInterface {
    List<Payment> getAllPayment();

    List<Payment> getIdPayment(int invoice_id);

    Payment add(Payment payment);

    List<Payment> deletePayment(int invoice_id);
}
