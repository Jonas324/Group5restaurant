package com.group5.restaurant.group5restaurant.tables;

import com.group5.restaurant.group5restaurant.tables.Table;
import com.group5.restaurant.group5restaurant.tables.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TableService {

    private final TableRepository tableRepository;

    @Autowired
    public TableService(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public List<Table> getTables(){
        return (List<Table>) tableRepository.findAll();
    }

    public void addNewTable(Table table) {
        Optional<Table> tableOptional = tableRepository.findTableByName(table.getTableName());
        if (tableOptional.isPresent()){
            throw new IllegalStateException("tableName taken");
        }
        tableRepository.save(table);
    }

    public void deleteTable(Long tableId) {
        boolean exists = tableRepository.existsById(tableId);
        if (!exists){
            throw new IllegalStateException("table with id" + tableId + "does not exists");
        }
        tableRepository.deleteById(tableId);
    }

    @Transactional
    public void updateTable(Long tableId, String tableName) {
        Table table = tableRepository.findById(tableId)
                .orElseThrow(() -> new IllegalStateException(
                        "table with id" + tableId + "does not exist"));

        if (tableName != null && tableName.length() > 0 &&
                !Objects.equals(table.getTableName(), tableName)){
            table.setTableName(Long.valueOf(tableName));
        }
    }
}
