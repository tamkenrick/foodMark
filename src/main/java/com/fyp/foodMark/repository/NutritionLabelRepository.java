package com.fyp.foodMark.repository;

import com.fyp.foodMark.entity.Food;
import com.fyp.foodMark.entity.NutritionLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NutritionLabelRepository extends JpaRepository<NutritionLabel, Long> {
    List<NutritionLabel> findByFoodId(Long foodId);
}