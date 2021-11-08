package com.sysco.onlineOrder.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orderProduct")
public class OrderProduct implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_product_id")
    private int orderProductId;

    @Column(name = "product_quantity")
    private Integer productQuantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order orderDetail;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "product_id" , referencedColumnName = "product_id")
    private Product product;

//
//    @OneToOne(mappedBy = "orderProduct" )
//    private Payment payment;


    public OrderProduct() {
    }

    public OrderProduct(int orderProductId, Integer productQuantity, Order orderId, Product product) {
        this.orderProductId = orderProductId;
        this.productQuantity = productQuantity;
        this.orderDetail = orderId;
        this.product = product;
    }

    public Order getOrder() {
        return orderDetail;
    }

    public void setOrderDetail(Order orderDetail) {
        this.orderDetail = orderDetail;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(int orderProductId) {
        this.orderProductId = orderProductId;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }


}
