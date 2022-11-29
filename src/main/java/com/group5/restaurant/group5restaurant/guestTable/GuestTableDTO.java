package com.group5.restaurant.group5restaurant.guestTable;

public class GuestTableDTO {

    private String guestTableName;

    private int guestTableSize;

    public GuestTableDTO() {
    }

    public GuestTableDTO(String guestTableName, int guestTableSize) {
        this.guestTableName = guestTableName;
        this.guestTableSize = guestTableSize;
    }

    public String getGuestTableName() {
        return guestTableName;
    }

    public void setGuestTableName(String guestTableName) {
        this.guestTableName = guestTableName;
    }

    public int getGuestTableSize() {
        return guestTableSize;
    }

    public void setGuestTableSize(int guestTableSize) {
        this.guestTableSize = guestTableSize;
    }

}