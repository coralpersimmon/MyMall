package com.coralpersimmon.mymall.service;

import com.coralpersimmon.mymall.dto.ProductQueryParams;
import com.coralpersimmon.mymall.dto.ProductRequest;
import com.coralpersimmon.mymall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
