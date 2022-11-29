package com.group5.restaurant.group5restaurant.guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("api/guest")
public class GuestController {

    private final GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping
    public ResponseEntity<List<Guest>> getAllGuests() {
        List<Guest> guests = guestService.getGuests();
        if (guests.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(guests, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Guest> registerNewGuest(@RequestBody GuestDTO guest) {
        guestService.addNewGuest(guest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{guestId}")
    public void deleteGuest(@PathVariable("guestId") Long guestId){
        guestService.deleteGuest(guestId);
    }

    @PutMapping(path = "{guestId}")
    public void updateGuest(
            @PathVariable("guestId") Long guestId,
            @RequestParam(required = false) String guestName){
        guestService.updateGuest(guestId, guestName);
    }
}
