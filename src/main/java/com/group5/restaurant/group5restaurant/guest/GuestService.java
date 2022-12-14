package com.group5.restaurant.group5restaurant.guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class GuestService {

    private final GuestRepository guestRepository;

    @Autowired
    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }


    public List<Guest> getGuests(){
        return guestRepository.findAll();
    }

    public void addNewGuest(GuestDTO guest) {
        Optional<Guest> guestOptional = guestRepository.findGuestByName(guest.getGuestName());
        if (guestOptional.isPresent()){
            throw new IllegalStateException("guestName taken");
        }
        Guest newGuest = new Guest();
        newGuest.setGuestName(guest.getGuestName());
        guestRepository.save(newGuest);
    }

    public void deleteGuest(Long guestId) {
        boolean exists = guestRepository.existsById(guestId);
        if (!exists){
            throw new IllegalStateException("guest with id" + guestId + "does not exists");
        }
        guestRepository.deleteById(guestId);
    }

    @Transactional
    public void updateGuest(Long guestId, String guestName) {
        Guest guest = guestRepository.findById(guestId)
                .orElseThrow(() -> new IllegalStateException(
                        "guest with id" + guestId + "does not exist"));

        if (guestName != null && guestName.length() > 0 &&
                !Objects.equals(guest.getGuestName(), guestName)){
            guest.setGuestName(guestName);
        }
    }

    public boolean doesGuestExist (String guestName) {
        Optional<Guest> guestOptional = guestRepository.findGuestByName(guestName);
        if (guestOptional.isPresent()){
            return true;
        }
        else {
            return false;
        }
    }
}

