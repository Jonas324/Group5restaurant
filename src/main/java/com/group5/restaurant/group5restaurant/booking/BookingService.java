package com.group5.restaurant.group5restaurant.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;



    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
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

    public void addBooking(Booking booking) {
        if  (isTableAvailable(new BookingDTO(booking.getStartTime(), booking.getEndTime(), booking.getTableID()))) {
            bookingRepository.save(booking);
        }
        else {
            throw new RuntimeException("Table is not available");
        }
    }

    public void deleteBooking(Integer id) {
        bookingRepository.deleteById(id);
    }



}