package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.entity.Payment;
import com.sysco.onlineOrder.repository.PaymentRepository;
import com.sysco.onlineOrder.service.PaymentServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImplementation implements PaymentServiceInterface {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImplementation.class);

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> getAllPayment() {
        return paymentRepository.findAll();
    }

    /**
     * get data using invoice id
     *
     * @param invoice_id
     * @return
     */

    @Override
    public List<Payment> getIdPayment(int invoice_id) {
        return paymentRepository.findById(invoice_id);
    }

    @Override
    public Payment add(Payment payment) {
        return paymentRepository.save(payment);
    }

    /**
     * delete by using id
     *
     * @param invoice_id
     * @return
     */

    @Override
    public List<Payment> deletePayment(int invoice_id) {
        List<Payment> delPaymentClass = null;
        try {
            delPaymentClass = paymentRepository.findById(invoice_id);

            if (delPaymentClass == null) {
                throw new Exception("Payment not found");
            } else {
                paymentRepository.deleteById(invoice_id);
            }
        } catch (Exception e) {
            LOGGER.error("PaymentServiceImplementation.java");
        }
        return delPaymentClass;
    }
}
