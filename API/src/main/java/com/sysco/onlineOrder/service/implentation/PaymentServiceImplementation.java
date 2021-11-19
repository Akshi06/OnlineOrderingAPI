package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.entity.Payment;
import com.sysco.onlineOrder.repository.PaymentRepository;
import com.sysco.onlineOrder.service.PaymentInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImplementation implements PaymentInterface {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductImplementation.class);

    @Autowired
    private PaymentRepository paymentRepository;

    /**
     * get all payment
     *
     * @return {@link List}
     * @see List
     * @see Payment
     */
    @Override
    public List<Payment> getAllPayment() {
        return paymentRepository.findAllPayment();
    }


    /**
     * get payment id
     *
     * @param invoiceId invoiceId
     * @return {@link List}
     * @see List
     * @see Payment
     */
    @Override
    public Payment getPaymentId(int invoiceId) {
        return paymentRepository.findByPaymentId(invoiceId);
    }

    /**
     * add payment
     *
     * @param payment payment
     * @return {@link Payment}
     * @see Payment
     */
    @Override
    public Payment addPayment(Payment payment) {
        return paymentRepository.save(payment);
    }


    /**
     * delete payment
     *
     * @param invoiceId invoiceId
     * @return {@link List}
     * @see Payment
     */
    @Override
    public Payment deletePayment(int invoiceId) {
        Payment delPaymentClass = null;
        try {
            delPaymentClass = paymentRepository.findByPaymentId(invoiceId);

            if (delPaymentClass == null) {
                throw new Exception("Payment not found");
            } else {
                paymentRepository.deleteById(invoiceId);
            }
        } catch (Exception e) {
            LOGGER.error("PaymentServiceImplementation.java");
        }
        return delPaymentClass;
    }
}
