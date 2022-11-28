package com.group5.restaurant.group5restaurant.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public List<Bill> getBills() {
        return billRepository.findAll();
    }

    //addBill with DTO
    public void addBill(BillDTO bill) {
        Bill newBill = new Bill();
        newBill.setPayAmount(bill.getPayAmount());
        newBill.setCustomerID(bill.getCustomerID());
        billRepository.save(newBill);
    }

    public void updateBill(Integer id, Integer billID, Integer payAmount, Integer customerID) {
        Bill bill = billRepository.findById(id).orElseThrow(() -> new IllegalStateException("Bill with id " + id + " does not exist"));
        if (billID != null && billID > 0 && billID != bill.getBillID()) {
            bill.setBillID(billID);
        }
        if (payAmount != null && payAmount > 0 && payAmount != bill.getPayAmount()) {
            bill.setPayAmount(payAmount);
        }
        if (customerID != null && customerID > 0 && customerID != bill.getCustomerID()) {
            bill.setCustomerID(customerID);
        }
    }

    public void deleteBill(Integer id) {
        billRepository.deleteById(id);
    }
}