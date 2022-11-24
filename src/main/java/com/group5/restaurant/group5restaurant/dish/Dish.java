package com.group5.restaurant.group5restaurant.dish;

import javax.persistence.*;

@Entity
@Table(name = "Dishes")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dishId;

    @Column(name = "Dish")
    private String dishName;

    private int price;


    public Dish() {
    }

    public Dish(String dishName) {
        this.dishName = dishName;
    }

    public Integer getId() {
        return dishId;
    }

    public void setId(Integer id) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public  Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}





