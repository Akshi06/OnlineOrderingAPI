package com.sysco.onlineOrder.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customerAddress")
public class CustomerAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerAddressId")
    private int cusAddressId;
    @Column(name = "zipCode")
    private int zipCode;
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;

    @OneToMany(mappedBy = "customerAddress")
    private List<Customer> customerList;

    public CustomerAddress() {
    }

    public CustomerAddress(int cusAddressId, int zipCode, String street, String city, String state) {
        this.cusAddressId = cusAddressId;
        this.zipCode = zipCode;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public int getCusAddressId() {
        return cusAddressId;
    }

    public void setCusAddressId(int cusAddressId) {
        this.cusAddressId = cusAddressId;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "CustomerAddress{" +
                "cusAddressId=" + cusAddressId +
                ", zipCode=" + zipCode +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
