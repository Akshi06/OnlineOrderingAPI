package com.sysco.onlineOrder.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int cusId;

    @Column(name = "customer_name")
    private String customerName;


    @Column(name = "customer_email")
    private String customerEmail;

    @Column(name = "customer_phone_number")
    private int customerPhone;

    @ManyToOne
    @JoinColumn(name = "customer_address_id")
    private CustomerAddress customerAddress;


    @OneToMany(mappedBy = "customer")
    private List<Order> orderList;


    public Customer() {
    }

    public Customer(int cusId, String customerName, String customerEmail, int customerPhone, CustomerAddress customerAddress) {
        this.cusId = cusId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
    }


    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    public CustomerAddress getAddress() {
        return customerAddress;
    }

    public void setAddress(CustomerAddress address) {
        this.customerAddress = address;
    }


}
