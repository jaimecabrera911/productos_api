package com.api.productos.service;

import com.api.productos.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product saveProduct(Product product) throws Exception;

}
