package com.group5.restaurant.group5restaurant.guestTable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GuestTableRepository extends CrudRepository<GuestTable, Long> {

    @Query("SELECT s FROM GuestTable s WHERE s.guestTableName = ?1")
    Optional<GuestTable> findGuestTableByName(String guestTableName);
}
