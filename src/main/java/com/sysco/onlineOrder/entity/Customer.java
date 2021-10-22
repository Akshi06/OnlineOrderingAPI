package com.sysco.onlineOrder.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")
    private int cusId;

    @Column(name = "customerName")
    private String customer_name;

    @Column(name = "customerEmail")
    private String customer_email;

    @Column(name = "customerPhoneNumber")
    private int customer_phone;

    @ManyToOne
    @JoinColumn(name = "customerAddressId")
    private CustomerAddress customerAddress;


    @OneToMany(mappedBy = "customer")
    private List<Order> orderList;


    public Customer() {
    }

    public Customer(int cusId, String customer_name, String customer_email, int customer_phone, CustomerAddress customer_address) {
        this.cusId = cusId;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_phone = customer_phone;
        this.customerAddress = customer_address;
    }


    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public int getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(int customer_phone) {
        this.customer_phone = customer_phone;
    }

    public CustomerAddress getAddress() {
        return customerAddress;
    }

    public void setAddress(CustomerAddress address) {
        this.customerAddress = address;
    }


}
