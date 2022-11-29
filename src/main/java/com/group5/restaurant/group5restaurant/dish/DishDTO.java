package com.group5.restaurant.group5restaurant.dish;

public class DishDTO {
    private String dishName;
    private int price;

    public DishDTO() {
    }

    public DishDTO(String dishName, int price) {
        this.dishName = dishName;
        this.price = price;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
