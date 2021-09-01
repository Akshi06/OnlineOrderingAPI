package com.sysco.onlineOrder.entity;




import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer{

    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private int cusId;
    @Column(name = "customer_type")
    private String customer_type;
    @Column(name = "customer_name")
    private String customer_name;
    @Column(name = "customer_email")
    private String customer_email;
    @Column(name = "customer_phone_number")
    private int customer_phone;
    @Column(name = "customer_address_id")
    private int address_id;

    public Customer() {
    }

    public Customer(int cusId, String customer_type, String customer_name, String customer_email, int customer_phone, int address) {

        this.cusId = cusId;
        this.customer_type = customer_type;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_phone = customer_phone;
        this.address_id = address;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
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

    public int getAddress() {
        return address_id;
    }

    public void setAddress(int address) {
        this.address_id = address;
    }


}
