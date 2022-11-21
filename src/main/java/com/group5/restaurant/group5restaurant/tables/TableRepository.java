package com.group5.restaurant.group5restaurant.tables;

import com.group5.restaurant.group5restaurant.guest.Guest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TableRepository extends CrudRepository<Table, Long> {

    @Query("SELECT s FROM Table s WHERE s.tableName = ?1")
    Optional<Table> findTableByName(String tableName);
}
