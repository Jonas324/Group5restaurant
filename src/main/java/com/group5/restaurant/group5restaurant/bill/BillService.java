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

    public void addBill(Bill bill) {
        billRepository.save(bill);
    }

    public void updateBill(Integer id, Integer bookingID, Integer tableID, Integer totalCost) {
        Bill bill = billRepository.findById(id).orElse(null);
        if (bill != null) {
            if (bookingID != null) {
                bill.setBookingID(bookingID);
            }
            if (tableID != null) {
                bill.setTableID(tableID);
            }
            if (totalCost != null) {
                bill.setTotalCost(totalCost);
            }
            billRepository.save(bill);
        }
    }

    public void deleteBill(Integer id) {
        billRepository.deleteById(id);
    }
}