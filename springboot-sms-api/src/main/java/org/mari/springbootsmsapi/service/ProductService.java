package org.mari.springbootsmsapi.service;

import org.mari.springbootsmsapi.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);

    Optional<Product> findProductById(Long id);

    Product updateProductById(Product product);

    void deleteProduct(Product product);
}
