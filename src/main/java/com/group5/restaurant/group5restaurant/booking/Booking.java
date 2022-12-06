package com.group5.restaurant.group5restaurant.booking;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BookingID")
    private Integer bookingID;

    @Column(name = "StartTime")
    private Date startTime;

    @Column(name = "EndTime")
    private Date endTime;

    @Column(name = "NumberOfGuests")
    private Integer numberOfGuests;

    @Column(name = "TableID")
    private Integer tableID;

    @Column(name = "BookerID")
    private Integer bookerID;

    public Booking() {
    }

    public Booking(Integer bookingID, Date startTime, Date endTime, Integer numberOfGuests, Integer tableID, Integer bookerID) {
        this.bookingID = bookingID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numberOfGuests = numberOfGuests;
        this.tableID = tableID;
        this.bookerID = bookerID;
    }

    public Booking(Date startTime, Date endTime, Integer tableID) {
        this.startTime = startTime;
        this.endTime = endTime;
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

    public Integer getBookerID() {
        return bookerID;
    }

    public void setBookerID(Integer bookerID) {
        this.bookerID = bookerID;
    }



}