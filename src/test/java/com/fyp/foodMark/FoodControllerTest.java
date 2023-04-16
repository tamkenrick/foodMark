package com.fyp.foodMark;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fyp.foodMark.controller.FoodController;
import com.fyp.foodMark.entity.Food;
import com.fyp.foodMark.entity.NutritionLabel;
import com.fyp.foodMark.entity.User;
import com.fyp.foodMark.repository.FoodRepository;
import com.fyp.foodMark.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FoodControllerTest {

    @Mock
    private FoodRepository foodRepository;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private FoodController foodController;

    private ObjectMapper objectMapper = new ObjectMapper();

//    @Test
//    public void testGetAllFoods() {
//        List<Food> foods = Arrays.asList(
//                new Food(1L, new User(), "Apple", "Fruit", 1.0, "each", LocalDate.now().plusDays(7),
//                        Arrays.asList(new NutritionLabel(0.3, 25, 0.5),)),
//                new Food(2L, new User(), "Chicken Breast", "Meat", 2.0, "lbs", LocalDate.now().plusDays(14),
//                        Arrays.asList(new NutritionLabel(1.0, 0, 26.0)))
//        );
//        Mockito.when(foodRepository.findAll()).thenReturn(foods);
//
//        List<Food> result = foodController.getAllFoods();
//
//        assertEquals(foods.size(), result.size());
//        assertEquals(foods.get(0).getName(), result.get(0).getName());
//        assertEquals(foods.get(1).getName(), result.get(1).getName());
//        assertEquals(foods.get(0).getNutritionLabels(), result.get(0).getNutritionLabels());
//        assertEquals(foods.get(1).getNutritionLabels(), result.get(1).getNutritionLabels());
//    }

//    @Test
//    public void testGetFoodById() {
//        Long id = 1L;
//        Food food = new Food(id, new User(), "Apple", "Fruit", 1.0, "each", LocalDate.now().plusDays(7),
//                Arrays.asList(new NutritionLabel(95, 0.3, 25, 0.5)));
//        Mockito.when(foodRepository.findById(id)).thenReturn(Optional.of(food));
//
//        ResponseEntity<Food> result = foodController.getFoodById(id);
//
//        assertEquals(HttpStatus.OK, result.getStatusCode());
//        assertEquals(food.getName(), result.getBody().getName());
//        assertEquals(food.getNutritionLabels(), result.getBody().getNutritionLabels());
//    }

    @Test
    public void testGetFoodByIdNotFound() {
        Long id = 1L;
        Mockito.when(foodRepository.findById(id)).thenReturn(Optional.empty());

        ResponseEntity<Food> result = foodController.getFoodById(id);

        assertEquals(HttpStatus.NOT_FOUND, result.getStatusCode());
    }

//    @Test
//    public void testCreateFood() throws Exception {
//        Food food = new Food(null, new User(), "Banana", "Fruit", 1.0, "each",
//                LocalDate.now().plusDays(7), Arrays.asList(new NutritionLabel(105, 1.2, 27, 0.8)));
//        String nutritionJson = objectMapper.writeValueAsString(food.getNutritionLabels());
//        String foodJson = "{\"name\":\"Banana\",\"category\":\"Fruit\",\"price\":1.0,\"unit\":\"each\"," +
//                "\"expiryDate\":\"" + food.getExpiryDate() + "\",\"nutritionLabels\":" + nutritionJson + "}";
//        Mockito.when(foodRepository.save(Mockito.any(Food.class))).thenAnswer(invocation -> {
//            Food savedFood = invocation.getArgument(0);
//            savedFood.setId(3L);
//            return savedFood;
//        });
//        ResponseEntity<Food> response = foodController.createFood(food);
//        assertEquals(HttpStatus.CREATED, response.getStatusCode());
//        assertEquals("Banana", response.getBody().getName());
//        assertEquals(3L, response.getBody().getId().longValue());
//        assertEquals(food.getNutritionLabels(), response.getBody().getNutritionLabels());
//        assertEquals("/foods/3", response.getHeaders().getLocation().toString());
//    }
}