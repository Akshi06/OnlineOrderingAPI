package com.sysco.onlineOrder.entity;

import javax.persistence.*;

@Entity
@Table(name = "orderProduct")
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderProductId")
    private int orderProduct_id;

    @Column(name = "productQuantity")
    private float productQuantity;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order orderDetail;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;


    @OneToOne(mappedBy = "orderProduct")
    private Payment payment;


    public OrderProduct() {
    }

    public OrderProduct(int orderProduct_id, float productQuantity, Order order_id, Product product) {
        this.orderProduct_id = orderProduct_id;
        this.productQuantity = productQuantity;
        this.orderDetail = order_id;
        this.product = product;
    }

    public Order getOrder() {
        return orderDetail;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrderProduct_id() {
        return orderProduct_id;
    }

    public void setOrderProduct_id(int orderProduct_id) {
        this.orderProduct_id = orderProduct_id;
    }

    public float getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(float productQuantity) {
        this.productQuantity = productQuantity;
    }


}
