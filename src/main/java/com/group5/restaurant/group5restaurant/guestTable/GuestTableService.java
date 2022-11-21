package com.group5.restaurant.group5restaurant.guestTable;

import com.group5.restaurant.group5restaurant.guest.Guest;
import com.group5.restaurant.group5restaurant.guestTable.GuestTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class GuestTableService {

    private final GuestTableRepository guestTableRepository;

    @Autowired
    public GuestTableService(GuestTableRepository guestTableRepository) {
        this.guestTableRepository = guestTableRepository;
    }

    public List<GuestTable> getGuestTables(){
        return (List<GuestTable>) guestTableRepository.findAll();
    }

    public void addNewGuestTable(GuestTable guestTable) {
        Optional<GuestTable> guestTableOptional = guestTableRepository.findGuestTableByName(guestTable.getGuestTableName());
        if (guestTableOptional.isPresent()){
            throw new IllegalStateException("guestTableName taken");
        }
        guestTableRepository.save(guestTable);
    }

    public void deleteGuestTable(Long guestTableId) {
        boolean exists = guestTableRepository.existsById(guestTableId);
        if (!exists){
            throw new IllegalStateException("guestTable with id" + guestTableId + "does not exists");
        }
        guestTableRepository.deleteById(guestTableId);
    }

    @Transactional
    public void updateGuestTable(Long guestTableId, String guestTableName) {
        GuestTable guestTable = guestTableRepository.findById(guestTableId)
                .orElseThrow(() -> new IllegalStateException(
                        "guestTable with id" + guestTableId + "does not exist"));

        if (guestTableName != null && guestTableName.length() > 0 &&
                !Objects.equals(guestTable.getGuestTableName(), guestTableName)){
            guestTable.setGuestTableName(guestTableName);
        }
    }
}
