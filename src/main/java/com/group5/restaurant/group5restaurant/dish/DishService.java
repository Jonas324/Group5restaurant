package com.group5.restaurant.group5restaurant.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {

    @Autowired
    private DishRepository dishRepository;

    public List<Dish> getDishes() {
        return dishRepository.findAll();
    }

    public Dish addDish(DishDTO dish) {
        Dish d = dishRepository.save(new Dish(dish.getDishName(), dish.getPrice()));
        return d;
    }

    public void updateDish(Integer id, String dishName, Integer price) {
        Dish dish = dishRepository.findById(id).orElseThrow(() -> new IllegalStateException(
                "dish with id " + id + " does not exist"
        ));

        if (dishName != null && dishName.length() > 0 && !dish.equals(dish.getDishName())) {
            dish.setDishName(dishName);
        }

        if (price != null && price > 0 && !dish.equals(dish.getPrice())) {
            dish.setPrice(price);
        }


        dishRepository.save(dish);
    }


        public void deleteDish(Integer id) {
        if (dishRepository.existsById(id)) {
            dishRepository.deleteById(id);
        } else {
            throw new RuntimeException("Dish with id " + id + " does not exist");
        }
    }
}

