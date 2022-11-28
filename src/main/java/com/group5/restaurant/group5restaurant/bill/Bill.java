package com.group5.restaurant.group5restaurant.bill;

import javax.persistence.*;

@Entity
@Table(name = "Bills")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BillID")
    private Integer billID;

    @Column(name = "PayAmount")
    private Integer payAmount;

    @Column(name = "CustomerID")
    private Integer customerID;

    public Bill() {
    }

    public Bill(Integer billID, Integer payAmount, Integer customerID) {
        this.billID = billID;
        this.payAmount = payAmount;
        this.customerID = customerID;
    }

    public Integer getBillID() {
        return billID;
    }

    public void setBillID(Integer billID) {
        this.billID = billID;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }


}