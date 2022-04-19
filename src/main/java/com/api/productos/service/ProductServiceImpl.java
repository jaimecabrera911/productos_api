package com.api.productos.service;

import com.api.productos.entity.Category;
import com.api.productos.entity.Product;
import com.api.productos.repository.CategoryRepository;
import com.api.productos.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final CategoryService categoryService;


    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }


    @Override
    public Product saveProduct(Product product) throws Exception {

        List<String> codes = product.getCategories().stream().map(Category::getCode).toList();


        List<Category> categories = categoryService.getCategoriesByCodes(codes);

        if (categories.size() != product.getCategories().size()) {
            throw new Exception("Una de las categoria(s) no existe(n)");
        }

        product.setCategories(categories);

        return productRepository.save(product);
    }
}
