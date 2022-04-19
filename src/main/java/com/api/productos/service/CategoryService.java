package com.api.productos.service;

import com.api.productos.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getCategories();

    Category saveCategory(Category category);

    List<Category> getAllCategories(List<Category> categories);

    List<Category> getCategoriesByCodes(List<String> codes);
}
