package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Payment;

import java.util.List;

public interface PaymentInterface {
    List<Payment> getAllPayment();

    Payment getPaymentId(int invoiceId);

    Payment addPayment(Payment payment);

    Payment deletePayment(int invoiceId);
}
