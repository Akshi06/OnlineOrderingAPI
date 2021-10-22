package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Payment;
import com.sysco.onlineOrder.service.PaymentServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping({"/v1/online-order"})
public class PaymentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private PaymentServiceInterface paymentServiceInterface;

    @GetMapping("/payment")
    public ResponseEntity<List<Payment>> getAllPayment() {
        List<Payment> payments = null;

        try {
            payments = paymentServiceInterface.getAllPayment();
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity<List<Payment>>(payments, HttpStatus.OK);
    }

    @GetMapping("/invoiceId/{id}")
    public ResponseEntity<List<Payment>> getIdPayment(@PathVariable("invoice_id") int invoice_id) {
        List<Payment> payment = null;
        try {
            payment = paymentServiceInterface.getIdPayment(invoice_id);
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity<List<Payment>>(payment, HttpStatus.OK);
    }


    @PostMapping("/payment")
    public ResponseEntity<Payment> add(@RequestBody Payment payment) {
        Payment payment1 = null;
        try {
            payment1 = paymentServiceInterface.add(payment);
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity<Payment>(payment, HttpStatus.OK);
    }
}
