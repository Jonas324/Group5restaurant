package com.group5.restaurant.group5restaurant.tables;

import org.hibernate.annotations.Tables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TablesController {

    private final TableService tableService;

    @Autowired
    public TablesController(TableService tableService) {
        this.tableService = tableService;
    }

    @GetMapping
    public List<Table> getTables(){
        return tableService.getTables();
    }

    @PostMapping
    public void registerNewTable(@RequestBody Table table){
        tableService.addNewTable(table);
    }

    @DeleteMapping("{tableId}")
    public void deleteTable(@PathVariable("tableId") Long tableId){
        tableService.deleteTable(tableId);
    }

    @PutMapping(path = "{tableId}")
    public void updateTable(
            @PathVariable("tableId") Long tableId,
            @RequestParam(required = false) String tableName){
        tableService.updateTable(tableId, tableName);
    }
}
