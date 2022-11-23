package com.group5.restaurant.group5restaurant.booking;

import com.group5.restaurant.group5restaurant.guest.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<Booking> getBookings() {
        return bookingService.getBookings();
    }

    @PostMapping
    public void addBooking(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
    }

    @PutMapping(path = "{id}")
    public void updateBooking(
            @PathVariable("id") Integer id,
            @RequestParam(required = false) String startTime,
            @RequestParam(required = false) String endTime,
            @RequestParam(required = false) Integer numberOfGuests,
            @RequestParam(required = false) Integer tableID
    ) {
        bookingService.updateBooking(id, startTime, endTime, numberOfGuests, tableID);
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Integer id)
    {
        bookingService.deleteBooking(id);
    }

//get all tables and set tableID based on availability



}