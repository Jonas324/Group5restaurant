//create a basic BookingService class

package com.group5.restaurant.group5restaurant.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public void addBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    public void deleteBooking(Integer id) {
        bookingRepository.deleteById(id);
    }

public boolean isTableAvailable(BookingDTO bookingDTO) {
        Date startTime = bookingDTO.getStartTime();
        Date endTime = bookingDTO.getEndTime();
        Integer tableID = bookingDTO.getTableID();

        List<Booking> bookings = bookingRepository.findAllByTableID(tableID);

        for (Booking booking : bookings) {
            if (booking.getStartTime().before(endTime) && booking.getEndTime().after(startTime)) {
                return false;
            }
        }
        return true;
    }

}