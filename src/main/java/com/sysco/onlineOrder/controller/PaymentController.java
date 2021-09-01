package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Payment;
import com.sysco.onlineOrder.service.PaymentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/online-order"})
public class PaymentController {
    @Autowired
    private PaymentServiceInterface paymentServiceInterface;

    @GetMapping("/payments")
    public ResponseEntity<List<Payment>> getAllPayment() {
        List<Payment> payments = null;

        try {
            payments = paymentServiceInterface.getAllPayment();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Payment>>(payments, HttpStatus.OK);
    }

    @GetMapping("/getInvoiceId/{id}")
    public ResponseEntity<Payment> getIdPayment(@PathVariable("invoice_id") int invoice_id) {
        Payment payment = null;
        try {
            payment = paymentServiceInterface.getIdPayment(invoice_id);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Payment>(payment, HttpStatus.OK);
    }
}
