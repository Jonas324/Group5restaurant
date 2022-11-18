//DishController for kysymys db

package com.group5.restaurant.group5restaurant.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dish")
public class DishController {

    @Autowired
    private DishService dishService;

    @GetMapping
    public List<Dish> getDishes() {
        return dishService.getDishes();
    }

    @PostMapping
    public void addDish(@RequestBody Dish dish) {
        dishService.addDish(dish);
    }

    @PutMapping
    public void updateDish(@RequestBody Dish dish) {
        dishService.updateDish(dish);
    }

    @DeleteMapping("/{id}")
    public void deleteDish(@PathVariable Integer id) {
        dishService.deleteDish(id);
    }
}