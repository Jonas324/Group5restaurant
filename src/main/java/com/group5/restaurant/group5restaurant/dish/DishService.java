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

    public void addDish(Dish dish) {
        dishRepository.save(dish);
    }

    public void updateDish(Integer id, String dishName) {
        Dish dish = dishRepository.findById(id).orElseThrow(() -> new IllegalStateException(
                "model with id " + id + " does not exist"
        ));

        if (dishName != null && dishName.length() > 0 && !dish.equals(dish.getDishName())) {
            dish.setDishName(dishName);
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

