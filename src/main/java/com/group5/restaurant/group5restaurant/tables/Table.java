package com.group5.restaurant.group5restaurant.tables;

import javax.persistence.*;

@Entity
@javax.persistence.Table(name = "Tables")
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tableName;

    public Table(){}

    public Table(Long id, String tableName){
        this.id = id;
        this.tableName = tableName;

    }

    public Table (String tableName) {
        this.tableName = tableName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(Long id) {
        this.tableName = tableName;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", tableName='" + tableName + '\'' +
                '}';
    }
}
