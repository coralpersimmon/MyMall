package com.coralpersimmon.mymall.service;

import com.coralpersimmon.mymall.dto.ProductRequest;
import com.coralpersimmon.mymall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
