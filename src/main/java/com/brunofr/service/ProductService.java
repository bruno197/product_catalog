package com.brunofr.service;

import com.brunofr.entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    List<Product> getAll();

    Product getById(UUID id);

    Product saveOrUpdate(Product product);

    void delete(UUID id);
}
