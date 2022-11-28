package com.group5.restaurant.group5restaurant.bill;

public class BillDTO {

private int payAmount;
private int customerID;

public BillDTO() {
}

public BillDTO(int payAmount, int customerID) {
    this.payAmount = payAmount;
    this.customerID = customerID;
}

public int getPayAmount() {
    return payAmount;
}

public void setPayAmount(int payAmount) {
    this.payAmount = payAmount;
}

public int getCustomerID() {
    return customerID;
}

public void setCustomerID(int customerID) {
    this.customerID = customerID;
}

}

