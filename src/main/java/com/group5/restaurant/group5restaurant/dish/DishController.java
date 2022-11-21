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

    @PutMapping(path = "{id}")
    public void updateDish(
            @PathVariable("id") Integer id,
            @RequestParam(required = false) String dishName,
            @RequestParam(required = false) Integer price
    ) {
        dishService.updateDish(id, dishName, price);
    }

    @DeleteMapping("/{id}")
    public void deleteDish(@PathVariable Integer id) {
        dishService.deleteDish(id);
    }
}