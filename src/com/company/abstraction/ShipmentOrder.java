package com.company.abstraction;

public class ShipmentOrder extends Order {
    private double shipmentPayment;

    public ShipmentOrder(long orderId, double shipmentPayment) {
        super(orderId);
        this.shipmentPayment=shipmentPayment;
    }

    public double getShipmentPayment() {
        return shipmentPayment;
    }

    public void setShipmentPayment(double shipmentPayment) {
        this.shipmentPayment = shipmentPayment;
    }

    @Override
    public double getTotalAmount() {
        double totalAmount = shipmentPayment;
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
