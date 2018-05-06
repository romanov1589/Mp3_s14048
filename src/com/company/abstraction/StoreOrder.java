package com.company.abstraction;

public class StoreOrder extends Order {

    public StoreOrder(long orderId) {
        super(orderId);
    }

    @Override
    public double getTotalAmount() {
        double totalAmount = 0;
        if(!super.getProductList().isEmpty()){
            for(Product product : super.getProductList()) {
                if(product != null) {
                    totalAmount += product.getPrice();
                }
            }
        }
        return totalAmount;
    }
}
