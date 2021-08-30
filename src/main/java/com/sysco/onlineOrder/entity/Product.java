package com.sysco.onlineOrder.entity;//package com.sysco.order.entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "product")
//public class Product {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "product_id")
//    private int productId;
//    @Column(name = "product_price")
//    private double price;
//    @Column(name = "product_categories")
//    private String categories;
//    @Column(name = "number_of_stock")
//    private float stock;
//    @Column(name = "product_name")
//    private String productName;
//
//    public Product() {
//    }
//
//    public Product(int productId, double price, String categories, float stock, String productName) {
//        this.productId = productId;
//        this.price = price;
//        this.categories = categories;
//        this.stock = stock;
//        this.productName = productName;
//    }
//
//    public int getProductId() {
//        return productId;
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public String getCategories() {
//        return categories;
//    }
//
//    public void setCategories(String categories) {
//        this.categories = categories;
//    }
//
//    public float getStock() {
//        return stock;
//    }
//
//    public void setStock(float stock) {
//        this.stock = stock;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "productId=" + productId +
//                ", price=" + price +
//                ", categories='" + categories + '\'' +
//                ", stock=" + stock +
//                ", productName='" + productName + '\'' +
//                '}';
//    }
//}
