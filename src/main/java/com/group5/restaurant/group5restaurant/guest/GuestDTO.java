package com.group5.restaurant.group5restaurant.guest;

public class GuestDTO {

        private String guestName;

        public GuestDTO() {
        }

        public GuestDTO(String guestName) {
            this.guestName = guestName;
        }

        public String getGuestName() {
            return guestName;
        }

        public void setGuestName(String guestName) {
            this.guestName = guestName;
        }
}
