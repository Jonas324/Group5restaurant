package com.group5.restaurant.group5restaurant.guest;

import javax.persistence.*;


@Entity
@Table(name = "Guests")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    @Column(name = "GuestName")
    private String guestName;

    public Guest() {
    }

    public Guest(String guestName) {
        this.guestName = guestName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

}