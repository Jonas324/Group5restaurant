package com.group5.restaurant.group5restaurant.dish;

import javax.persistence.*;

@Entity
@Table(name = "Dishes")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Dish")
    private String dishName;


    public Dish() {
    }

    public Dish(String dishName) {
        this.dishName = dishName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
}





