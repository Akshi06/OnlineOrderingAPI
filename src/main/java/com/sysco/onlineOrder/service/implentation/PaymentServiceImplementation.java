package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.entity.Payment;
import com.sysco.onlineOrder.repository.PaymentRepository;
import com.sysco.onlineOrder.service.PaymentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImplementation implements PaymentServiceInterface {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> getAllPayment() {
        return (List<Payment>) paymentRepository.findAll();
    }

    @Override
    public Payment getIdPayment(int invoice_id) {
        return paymentRepository.findById(invoice_id).orElse(null);
    }

    @Override
    public Payment update(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment deletePayment(int invoice_id) {
        Payment delPaymentClass = null;
        try {
            delPaymentClass = paymentRepository.findById(invoice_id).orElse(null);

            if (delPaymentClass == null) {
                throw new Exception("Payment not found...!");
            } else {
                paymentRepository.deleteById(invoice_id);
            }
        } catch (Exception e) {
            System.out.println("PaymentServiceImplementation.java");
        }
        return delPaymentClass;
    }
}
