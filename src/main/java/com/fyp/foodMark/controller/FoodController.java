package com.fyp.foodMark.controller;

import com.fyp.foodMark.entity.Food;
import com.fyp.foodMark.entity.NutritionLabel;
import com.fyp.foodMark.service.FoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/foods")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("")
    public List<Food> getAllFoods() {
        return foodService.getAllFoods();
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Food>> getFoodByUserId(@PathVariable Long userId) {
        List<Food> foodList = foodService.getFoodByUserId(userId);
        Collections.sort(foodList, Comparator.comparing(Food::getExpiryDate));
        return ResponseEntity.ok(foodList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable Long id) {
        Optional<Food> food = foodService.getFoodById(id);
        if (food.isPresent()) {
            return ResponseEntity.ok(food.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/user/{userId}")
    public ResponseEntity<List<Food>> createFood(@PathVariable Long userId, @RequestBody List<Food> foodList) {
        return ResponseEntity.ok(foodService.createFood(userId, foodList));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Food> updateFood(@PathVariable Long id, @RequestBody Food newFood, @RequestBody List<NutritionLabel> nutritionLabels) {
        Optional<Food> optionalFood = foodService.updateFood(id, newFood, nutritionLabels);
        if (optionalFood.isPresent()) {
            return ResponseEntity.ok(optionalFood.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFood(@PathVariable Long id) {
        foodService.deleteFood(id);
        return ResponseEntity.noContent().build();
    }

//    @GetMapping("/{id}/nutrition")
//    public List<NutritionLabel> getNutritionLabelsForFood(@PathVariable Long id) {
//        return foodService.getNutritionLabelsForFood(id);
//    }
}