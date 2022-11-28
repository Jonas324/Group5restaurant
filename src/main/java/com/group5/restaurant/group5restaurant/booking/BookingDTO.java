package com.group5.restaurant.group5restaurant.booking;

import java.util.Date;

public class BookingDTO {


    private Date startTime;
    private Date endTime;
    private Integer tableID;

    private String guestName;

    public BookingDTO() {
    }

    public BookingDTO(Date startTime, Date endTime, Integer tableID, String guestName) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.tableID = tableID;
        this.guestName = guestName;
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

    public Integer getTableID() {
        return tableID;
    }

    public void setTableID(Integer tableID) {
        this.tableID = tableID;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

}