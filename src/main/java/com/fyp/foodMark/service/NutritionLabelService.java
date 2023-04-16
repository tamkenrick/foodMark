package com.fyp.foodMark.service;

import com.fyp.foodMark.entity.NutritionLabel;
import com.fyp.foodMark.repository.NutritionLabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionLabelService {

    @Autowired
    private NutritionLabelRepository nutritionLabelRepository;

    public void saveNutritionLabel(NutritionLabel nutritionLabel) {
        nutritionLabelRepository.save(nutritionLabel);
    }

    public void saveNutritionLabels(List<NutritionLabel> nutritionLabels) {
        nutritionLabelRepository.saveAll(nutritionLabels);
    }

    public List<NutritionLabel> getNutritionLabelsByFoodId(Long foodId) {
        return nutritionLabelRepository.findByFoodId(foodId);
    }
}