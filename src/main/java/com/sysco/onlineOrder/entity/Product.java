package com.sysco.onlineOrder.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_price")
    private double price;

    @Column(name = "product_categories")
    private String categories;
    // Category

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_img")
    private String img;

    @Column(name = "product_description")
    private String productDescription;


    @OneToMany(mappedBy = "product")
    private List<OrderProduct> orderProductList;


    public Product() {
    }

    public Product(int productId, double price, String categories, String productName, String img, String productDescription) {
        this.productId = productId;
        this.price = price;
        this.categories = categories;
        this.productName = productName;
        this.img = img;
        this.productDescription = productDescription;

    }

    public String getImg() {
        return img;
    }


    public void setImg(String img) {
        this.img = img;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", price=" + price +
                ", categories='" + categories + '\'' +
                ", productName='" + productName + '\'' +
                ", img='" + img + '\'' +
                ", orderProductList=" + orderProductList +
                '}';
    }
}
