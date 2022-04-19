package com.api.productos.service;

import com.api.productos.entity.Category;
import com.api.productos.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategories(List<Category> categories) {
        categories.stream().map(category -> categoryRepository.findCategoryByCode(category.getCode()).get());
        return null;
    }

    @Override
    public List<Category> getCategoriesByCodes(List<String> codes) {
        return categoryRepository.findCategoryByCodeIn(codes);
    }
}
