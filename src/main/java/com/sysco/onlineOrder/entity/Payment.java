package com.sysco.onlineOrder.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private int invoiceNo;
    @Column(name = "total_amount")
    private int totalPayment;
    @Column(name = "payment_method")
    private String paymentMethod;
    @Column(name = "payment_date")
    private Date paymentDate;
//
//    @OneToOne
//    @JoinColumn(name = "order_product_id")
//    private OrderProduct order_product;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "order_product_id")
//    private OrderProduct order_product;
@OneToOne
@JoinColumn(name = "order_product_id")
private OrderProduct order_product;

    public Payment() {

    }

    public Payment(int invoiceNo, int totalPayment, String paymentMethod, Date paymentDate ,OrderProduct orderProduct) {
        this.invoiceNo = invoiceNo;
        this.totalPayment = totalPayment;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
        this.order_product = orderProduct;

    }

    public OrderProduct getOrderProduct() {
        return order_product;
    }

    public void setOrderProduct(OrderProduct orderProduct) {
        this.order_product = orderProduct;
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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

}

