package com.sysco.onlineOrder.entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "order_detail")
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "order_id")
//    private int orderId;
//    @Column(name = "order_date")
//    private Date orderDate;
//
//    public Order() {
//    }
//
//    public Order(int orderId, Date orderDate) {
//        this.orderId = orderId;
//        this.orderDate = orderDate;
//    }
//
//    public int getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(int orderId) {
//        this.orderId = orderId;
//    }
//
//    public Date getOrderDate() {
//        return orderDate;
//    }
//
//    public void setOrderDate(Date orderDate) {
//        this.orderDate = orderDate;
//    }
//
//    @Override
//    public String toString() {
//        return "Order{" +
//                "orderId=" + orderId +
//                ", orderDate=" + orderDate +
//                '}';
//    }
//}
