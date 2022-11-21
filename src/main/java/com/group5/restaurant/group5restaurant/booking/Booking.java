package com.group5.restaurant.group5restaurant.booking;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name = "Bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "StartTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private String startTime;

    @Column(name = "EndTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private String endTime;

    @Column(name = "NumberOfGuests")
    private Integer numberOfGuests;

    @Column(name = "TableID")
    private Integer tableID;

    public Booking() {
    }

    public Booking(String startTime, String endTime, Integer numberOfGuests, Integer tableID) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.numberOfGuests = numberOfGuests;
        this.tableID = tableID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
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