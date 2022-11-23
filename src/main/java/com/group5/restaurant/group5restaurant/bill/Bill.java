package com.group5.restaurant.group5restaurant.bill;//create a Bill object

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

    public Bill() {
    }

    public Bill(Integer billID, Integer payAmount) {
        this.billID = billID;
        this.payAmount = payAmount;
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

}