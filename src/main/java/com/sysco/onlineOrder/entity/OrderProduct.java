package com.sysco.onlineOrder.entity;

import javax.persistence.*;

@Entity
@Table(name = "orderProduct")
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_product_id")
    private int orderProductId;

    @Column(name = "product_quantity")
    private float productQuantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order orderDetail;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


    @OneToOne(mappedBy = "orderProduct")
    private Payment payment;


    public OrderProduct() {
    }

    public OrderProduct(int orderProductId, float productQuantity, Order orderId, Product product) {
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

    public float getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(float productQuantity) {
        this.productQuantity = productQuantity;
    }


}
