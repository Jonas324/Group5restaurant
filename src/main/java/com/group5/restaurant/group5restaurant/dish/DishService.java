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

    public void updateDish(Dish dish) {
        dishRepository.save(dish);
    }

    public void deleteDish(Integer id) {
        dishRepository.deleteById(id);
    }
}

