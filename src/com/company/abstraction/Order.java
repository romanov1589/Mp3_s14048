package com.company.abstraction;

import java.util.ArrayList;
import java.util.List;

public abstract class Order {
    private long orderId;
    private List<Product> productList = new ArrayList<>();
    public abstract double getTotalAmount();

    public Order(long orderId) {
        this.orderId = orderId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProductList() {
        List<Product> copyOfProductsList = this.productList;
        return copyOfProductsList;
    }

    public void setProductList(List<Product> productList) {
        if(productList == null){
            throw new IllegalArgumentException("Product list can't be null!");
        }
        this.productList = productList;
    }

    public String toString(){
        return getOrderId() + "-" + getTotalAmount();
    }
}
