package com.brunofr.adapter.product;

import com.brunofr.adapter.IAdapter;
import com.brunofr.dto.ProductDTO;
import com.brunofr.entity.Product;

import java.util.List;

public class ProductAdapter implements IAdapter<Product, ProductDTO> {

    @Override
    public Product toEntity(ProductDTO dto) {
        return null;
    }

    @Override
    public List<Product> toEntityList(List<ProductDTO> dtoList) {
        return null;
    }
}
