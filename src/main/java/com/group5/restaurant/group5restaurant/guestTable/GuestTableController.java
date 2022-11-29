package com.group5.restaurant.group5restaurant.guestTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/tables")

public class GuestTableController {

    private final GuestTableService guestTableService;

    @Autowired
    public GuestTableController(GuestTableService guestTableService) {
        this.guestTableService = guestTableService;
    }

    @GetMapping
    public ResponseEntity<List<GuestTable>> getAllGuestTables() {
        List<GuestTable> guestTables = guestTableService.getGuestTables();
        if (guestTables.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(guestTables);
    }

    @PostMapping
    public ResponseEntity<GuestTable> registerNewGuestTable(@RequestBody GuestTableDTO guestTable) {
        GuestTable d = guestTableService.addNewGuestTable(guestTable);
        if (d == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(d, HttpStatus.CREATED);
    }

    @DeleteMapping("{tableId}")
    public void deleteGuestTable(@PathVariable("tableId") Long guestTableId){
        guestTableService.deleteGuestTable(guestTableId);
    }

    @PutMapping(path = "{tableId}")
    public void updateGuestTable(
            @PathVariable("tableId") Long guestTableId,
            @RequestParam(required = false) String guestTableName){
        guestTableService.updateGuestTable(guestTableId, guestTableName);
    }
}
