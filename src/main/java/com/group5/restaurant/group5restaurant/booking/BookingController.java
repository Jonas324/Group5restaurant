

package com.group5.restaurant.group5restaurant.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping
    public void addBooking(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Integer id) {
        bookingService.deleteBooking(id);
    }

//isTableAvailable using BookingDTO
    @PostMapping("/isTableAvailable")
    public boolean isTableAvailable(@RequestBody BookingDTO bookingDTO) {
        return bookingService.isTableAvailable(bookingDTO);
    }
}