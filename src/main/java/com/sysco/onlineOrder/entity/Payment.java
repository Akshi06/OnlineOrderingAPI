package com.sysco.onlineOrder.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoiceId")
    private int invoiceNo;
    @Column(name = "totalAmount")
    private int totalPayment;
    @Column(name = "paymentDate")
    private Date paymentDate;

    @OneToOne
    @JoinColumn(name = "orderProductId")
    private OrderProduct orderProduct;

    public Payment() {

    }

    public Payment(int invoiceNo, int totalPayment, Date paymentDate, OrderProduct orderProduct) {
        this.invoiceNo = invoiceNo;
        this.totalPayment = totalPayment;
        this.paymentDate = paymentDate;
        this.orderProduct = orderProduct;

    }

    public OrderProduct getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(OrderProduct orderProduct) {
        this.orderProduct = orderProduct;
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

}

