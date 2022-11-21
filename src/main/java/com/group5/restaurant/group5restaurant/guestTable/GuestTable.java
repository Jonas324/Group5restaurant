package com.group5.restaurant.group5restaurant.guestTable;

import com.group5.restaurant.group5restaurant.guest.Guest;

import javax.persistence.*;

@Entity
@Table(name = "GuestTables")
public class GuestTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String guestTableName;

    private int guestTableSize;

    public GuestTable(){}

    public GuestTable(Long id, String guestTableName, int guestTableSize){
        this.id = id;
        this.guestTableName = guestTableName;
        this.guestTableSize = guestTableSize;

    }

    public GuestTable (String guestTableName) {
        this.guestTableName = guestTableName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGuestTableName() {
        return guestTableName;
    }

    public void setGuestTableName(String guestTableName) {
        this.guestTableName = guestTableName;
    }

    public Integer getGuestTableSize(){
        return guestTableSize;
    }

    public void setGuestTableSize(int guestTableSize) {
        this.guestTableSize = guestTableSize;
    }

    @Override
    public String toString() {
        return "GuestTable{" +
                "id=" + id +
                ", guestTableName='" + guestTableName + '\'' +
                '}';
    }
}
