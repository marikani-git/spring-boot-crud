package org.mari.springbootsmsapi.service;

import org.mari.springbootsmsapi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
