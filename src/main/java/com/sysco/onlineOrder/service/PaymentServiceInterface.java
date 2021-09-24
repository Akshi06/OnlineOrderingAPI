package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Payment;

import java.util.List;

public interface PaymentServiceInterface {
    List<Payment> getAllPayment();

    Payment getIdPayment(int invoice_id);

    Payment add(Payment payment);

    Payment deletePayment(int invoice_id);
}
