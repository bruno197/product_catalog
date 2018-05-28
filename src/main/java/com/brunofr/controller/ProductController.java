package com.brunofr.controller;

import com.brunofr.entity.Product;
import com.brunofr.service.ProductService;
import com.datastax.driver.core.utils.UUIDs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        System.out.println("Get all products...");

        List<Product> products = new ArrayList<>();
        return productService.getAll();
    }

    @PostMapping("/products/save")
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product) {
        System.out.println("Create product: " + product.getName() + "...");

        product.setId(UUIDs.timeBased());
        return new ResponseEntity<>(productService.saveOrUpdate(product), HttpStatus.OK);
    }
}
