package com.group5.restaurant.group5restaurant.booking;

import com.group5.restaurant.group5restaurant.guest.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private GuestService guestService;



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

    public Booking addBooking(BookingDTO booking) {
        if (!guestService.doesGuestExist(booking.getGuestName())) return null;
        if  (isTableAvailable(new BookingDTO(booking.getStartTime(), booking.getEndTime(), booking.getTableID(), booking.getGuestName()))) {
            Booking b = bookingRepository.save(new Booking(booking.getStartTime(), booking.getEndTime(), booking.getTableID()));
            return b;
        }
        else {
            return null;
        }
    }

    public void deleteBooking(Integer id) {
        bookingRepository.deleteById(id);
    }



}