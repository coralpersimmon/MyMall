package com.coralpersimmon.mymall.dao;

import com.coralpersimmon.mymall.dto.ProductRequest;
import com.coralpersimmon.mymall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
}
