package com.group5.restaurant.group5restaurant.bill;

import com.group5.restaurant.group5restaurant.booking.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bill")

public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping
    public ResponseEntity<List<Bill>> getBills() {
        List<Bill> bills = billService.getBills();
        if (bills.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(bills, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Bill> addBill(@RequestBody BillDTO bill) {
        billService.addBill(bill);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(path = "{id}")
    public void updateBill(
            @PathVariable("id") Integer id,
            @RequestParam(required = false) Integer bookingID,
            @RequestParam(required = false) Integer tableID,
            @RequestParam(required = false) Integer totalCost
    ) {
        billService.updateBill(id, bookingID, tableID, totalCost);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Integer id) {
        billService.deleteBill(id);
    }



}