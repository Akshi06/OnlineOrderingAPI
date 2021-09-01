package com.sysco.onlineOrder.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_product")
public class OrderProduct {
    @Id
    @GeneratedValue
    @Column(name = "order_product_id")
    private int orderProduct;
    @Column(name = "product_quantity")
    private float productQuantity;

    public OrderProduct() {
    }

    public OrderProduct(int orderProduct, float productQuantity) {
        this.orderProduct = orderProduct;
        this.productQuantity = productQuantity;
    }

    public int getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(int orderProduct) {
        this.orderProduct = orderProduct;
    }

    public float getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(float productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
                "orderProduct=" + orderProduct +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
