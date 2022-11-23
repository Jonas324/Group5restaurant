package com.group5.restaurant.group5restaurant.bill;

import javax.persistence.*;

@Entity
@Table(name = "Bills")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setBookingID(Integer bookingID) {
    }

    public void setTableID(Integer tableID) {
    }

    public void setTotalCost(Integer totalCost) {
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

}