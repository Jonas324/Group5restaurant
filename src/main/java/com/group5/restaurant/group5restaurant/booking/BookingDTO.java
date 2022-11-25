//booking dto

package com.group5.restaurant.group5restaurant.booking;

import java.util.Date;

public class BookingDTO {

    private Integer bookingID;
    private Date startTime;
    private Date endTime;
    private Integer numberOfGuests;
    private Integer tableID;

    public BookingDTO() {
    }

    public BookingDTO(Integer bookingID, Date startTime, Date endTime, Integer numberOfGuests, Integer tableID) {
        this.bookingID = bookingID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numberOfGuests = numberOfGuests;
        this.tableID = tableID;
    }

    public Integer getBookingID() {
        return bookingID;
    }

    public void setBookingID(Integer bookingID) {
        this.bookingID = bookingID;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(Integer numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public Integer getTableID() {
        return tableID;
    }

    public void setTableID(Integer tableID) {
        this.tableID = tableID;
    }
}