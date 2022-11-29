package com.group5.restaurant.group5restaurant.guestTable;

import com.group5.restaurant.group5restaurant.guest.Guest;

import javax.persistence.*;

@Entity
@Table(name = "GuestTables")
public class GuestTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guestTableId;
    private String guestTableName;

    private int guestTableSize;

    public GuestTable(){}

    public GuestTable(Long guestTableId, String guestTableName, int guestTableSize){
        this.guestTableId = guestTableId;
        this.guestTableName = guestTableName;
        this.guestTableSize = guestTableSize;

    }

    public GuestTable (String guestTableName) {
        this.guestTableName = guestTableName;
    }

    public GuestTable(String guestTableName, int guestTableSize) {
        this.guestTableName = guestTableName;
        this.guestTableSize = guestTableSize;
    }

    public Long getGuestTableId() {
        return guestTableId;
    }

    public void setGuestTableId(Long guestTableId) {
        this.guestTableId = guestTableId;
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

}
