package com.fyp.foodMark.service;

import com.fyp.foodMark.entity.Food;
import com.fyp.foodMark.entity.NutritionLabel;
import com.fyp.foodMark.entity.User;
import com.fyp.foodMark.repository.FoodRepository;
import com.fyp.foodMark.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FoodService {

    @Autowired
    private UserService userService;

    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private NutritionLabelService nutritionLabelService;

    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    public Optional<Food> getFoodById(Long id) {
        return foodRepository.findById(id);
    }

    public List<Food> createFood(Long userId, List<Food> foodList) {
        User user = userService.getUserById(userId);
        for(Food food : foodList){
            food.setUser(user);
            foodRepository.save(food);
            log.info("Food name " + food.getName() + " with expiryDate " + food.getExpiryDate() + "saved to " + user.getUsername() + " successfully");
        }
        return foodList;
    }

    public Optional<Food> updateFood(Long id, Food newFood, List<NutritionLabel> nutritionLabels) {
        Optional<Food> optionalFood = foodRepository.findById(id);
        if (optionalFood.isPresent()) {
            Food food = optionalFood.get();
            food.setUser(newFood.getUser());
            food.setName(newFood.getName());
            food.setType(newFood.getType());
            food.setQuantity(newFood.getQuantity());
            food.setUnit(newFood.getUnit());
            food.setExpiryDate(newFood.getExpiryDate());
            food.setImage(newFood.getImage());
            food.setNutritionLabels(nutritionLabels);
            foodRepository.save(food);
            return Optional.of(food);
        } else {
            return Optional.empty();
        }
    }

    public void deleteFood(Long id) {
        foodRepository.deleteById(id);
    }

    public List<NutritionLabel> getNutritionLabelsForFood(Long foodId) {
        return nutritionLabelService.getNutritionLabelsByFoodId(foodId);
    }

    public List<Food> getFoodByUserId(Long userId) {
        User user = userService.getUserById(userId);
        return user.getFoods();
    }
}