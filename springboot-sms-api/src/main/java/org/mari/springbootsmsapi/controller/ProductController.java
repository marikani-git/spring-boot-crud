package org.mari.springbootsmsapi.controller;

import org.mari.springbootsmsapi.entity.Product;
import org.mari.springbootsmsapi.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query) {
        return ResponseEntity.ok(productService.searchProducts(query));
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) throws Exception{
        Product product  = productService.findProductById(id).orElseThrow(() -> new Exception("Product not found for " + id));
        product.setName(productDetails.getName());
        product.setDescription(productDetails.getDescription());
        return ResponseEntity.ok(productService.updateProductById(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) throws Exception{
        Product product  = productService.findProductById(id).orElseThrow(() -> new Exception("Product not found for " + id));
        productService.deleteProduct(product);
        return ResponseEntity.ok("Deleted product ID: " + id);
    }
}
