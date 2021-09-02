package com.sysco.onlineOrder.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_product")
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_product_id")
    private int orderProduct;
    @Column(name = "product_quantity")
    private float productQuantity;
    @ManyToOne
    @MapsId
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @MapsId
    @JoinColumn(name = "product_id")
    private Product product;

    public OrderProduct() {
    }

    public OrderProduct(int orderProduct, float productQuantity) {
        this.orderProduct = orderProduct;
        this.productQuantity = productQuantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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


}
