package com.api.productos.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("product")
public class Product {

    @Id
    private String id;

    private String brand;

    private String code;

    private String description;

    private String picture;

    private Double price;

    @Field
    private boolean status = false;

    private int stock;

    private String title;

    @DBRef
    private List<Category> categories;


}
