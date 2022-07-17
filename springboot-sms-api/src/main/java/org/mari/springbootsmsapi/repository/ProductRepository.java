package org.mari.springbootsmsapi.repository;

import org.mari.springbootsmsapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select p from Product p where " +
    "p.name like concat('%', :query, '%') " +
    "OR p.description like concat('%', ':query', '%')")
    List<Product> searchProducts(String query);

    @Query(value = "select * from products p where " +
            "p.name like concat('%', :query, '%') " +
            "OR p.description like concat('%', ':query', '%')", nativeQuery = true)
    List<Product> searchProductsNativeSql(String query);
}
