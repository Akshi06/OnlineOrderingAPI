package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Order;
import com.sysco.onlineOrder.entity.Payment;
import com.sysco.onlineOrder.service.PaymentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/v1/online-order"})
public class PaymentController {
    @Autowired
    private PaymentServiceInterface paymentServiceInterface;

    @GetMapping("/payment")
    public ResponseEntity<List<Payment>> getAllPayment() {
        List<Payment> payments = null;

        try {
            payments = paymentServiceInterface.getAllPayment();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Payment>>(payments, HttpStatus.OK);
    }

    @GetMapping("/invoiceId/{id}")
    public ResponseEntity<Payment> getIdPayment(@PathVariable("invoice_id") int invoice_id) {
        Payment payment = null;
        try {
            payment = paymentServiceInterface.getIdPayment(invoice_id);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Payment>(payment, HttpStatus.OK);
    }


    @PostMapping("/payment")
    public ResponseEntity<Payment> add(@RequestBody  Payment payment) {
        Payment payment1 = null;
        try {
            payment1 = paymentServiceInterface.add(payment);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Payment>(payment, HttpStatus.OK);
    }
}
