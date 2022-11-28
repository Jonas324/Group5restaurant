package com.group5.restaurant.group5restaurant.bill;

public class BillDTO {

    private double amount;

    public BillDTO(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
