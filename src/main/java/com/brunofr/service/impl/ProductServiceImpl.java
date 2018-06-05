package com.brunofr.service.impl;

import com.brunofr.entity.Product;
import com.brunofr.repository.ProductRepository;
import com.brunofr.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductServiceImpl implements ProductService {

//    @Autowired
//    private ProductRepository productRepository;
//
//    @Override
//    public List<Product> getAll() {
//        List<Product> products = new ArrayList<>();
//        productRepository.findAll().forEach(products::add);
//        return products;
//    }
//
//    @Override
//    public Product getById(UUID id) {
//        return null;//productRepository.findById(id).get();
//    }
//
//    @Override
//    public Product saveOrUpdate(Product product) {
//        return productRepository.save(product);
//    }
//
//    @Override
//    public void delete(UUID id) {
//        //productRepository.deleteById(id);
//    }
}
