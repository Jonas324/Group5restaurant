package com.group5.restaurant.group5restaurant.booking;

import com.group5.restaurant.group5restaurant.guest.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    public void addBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    public void updateBooking(Integer id, String startTime, String endTime, Integer numberOfGuests, Integer tableID) {
        Booking booking = bookingRepository.findById(id).orElse(null);
        if (booking != null) {
            if (startTime != null) {
                booking.setStartTime(startTime);
            }
            if (endTime != null) {
                booking.setEndTime(endTime);
            }
            if (numberOfGuests != null) {
                booking.setNumberOfGuests(numberOfGuests);
            }
            if (tableID != null) {
                booking.setTableID(tableID);
            }
            bookingRepository.save(booking);
        }
    }

    public void deleteBooking(Integer id) {
        bookingRepository.deleteById(id);
    }



}