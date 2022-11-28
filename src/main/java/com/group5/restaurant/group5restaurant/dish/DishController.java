package com.group5.restaurant.group5restaurant.dish;

import com.group5.restaurant.group5restaurant.guest.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dish")
public class DishController {

    @Autowired
    private DishService dishService;

    @GetMapping
    public ResponseEntity<List<Dish>> getDishes() {
        List<Dish> dishes = dishService.getDishes();
        if (dishes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(dishes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Dish> addDish(@RequestBody Dish dish) {
        dishService.addDish(dish);
        return new ResponseEntity<>(dish, HttpStatus.CREATED);
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