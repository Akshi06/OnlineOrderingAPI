package com.sysco.onlineOrder.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order_product")
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_product_id")
    private int orderProduct_id;
    @Column(name = "product_quantity")
    private float productQuantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order_detail;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


@OneToOne(mappedBy = "order_product")
private Payment payment;


    public OrderProduct() {
    }

    public OrderProduct(int orderProduct_id, float productQuantity, Order order_id, Product product) {
        this.orderProduct_id = orderProduct_id;
        this.productQuantity = productQuantity;
        this.order_detail = order_id;
        this.product = product;
    }

    public Order getOrder() {
        return order_detail;
    }

    public void setOrder(Order order) {
        this.order_detail = order;
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
