package com.company.abstraction;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Product1", 100.00);
        Product product2 = new Product(2, "Product2", 50.00);

        Product product3 = new Product(1, "Product3", 200.00);
        Product product4 = new Product(2, "Product4", 50.00);

        Order shipmentOrder = new ShipmentOrder(1, 20.00);
        Order storeOrder = new StoreOrder(2);

        shipmentOrder.getProductList().add(product1);
        shipmentOrder.getProductList().add(product2);

        storeOrder.getProductList().add(product3);
        storeOrder.getProductList().add(product4);

        System.out.println(shipmentOrder);
        System.out.println(storeOrder);

    }
}
