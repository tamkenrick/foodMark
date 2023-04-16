package com.fyp.foodMark.repository;

import com.fyp.foodMark.entity.Food;
import com.fyp.foodMark.entity.NutritionLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    // ...

    default void saveFoodWithNutritionLabels(Food food, List<NutritionLabel> nutritionLabels) {
        food.setNutritionLabels(nutritionLabels);
        save(food);
    }
}