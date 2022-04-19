package com.api.productos.repository;

import com.api.productos.entity.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends MongoRepository<Category, String> {
    Optional<Category> findCategoryByCode(String code);

    List<Category> findCategoryByCodeIn(List<String> codes);
}
