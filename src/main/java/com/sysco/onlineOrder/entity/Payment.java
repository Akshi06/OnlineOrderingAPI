package com.sysco.onlineOrder.entity;

import javax.persistence.*;

@Entity
@Table(name = "payment")
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

    public Payment() {
    }

    public Payment(int invoiceNo, int totalPayment, String paymentMethod, Date paymentDate) {
        this.invoiceNo = invoiceNo;
        this.totalPayment = totalPayment;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
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

    @Override
    public String toString() {
        return "Payment{" +
                "invoiceNo=" + invoiceNo +
                ", totalPayment=" + totalPayment +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentDate=" + paymentDate +
                '}';
    }
}

