package com.group5.restaurant.group5restaurant.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bill")

public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping
    public List<Bill> getBills() {
        return billService.getBills();
    }

    @PostMapping
    public void addBill(@RequestBody Bill bill) {
        billService.addBill(bill);
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