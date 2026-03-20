package com.coralpersimmon.mymall.service.impl;

import com.coralpersimmon.mymall.dao.ProductDao;
import com.coralpersimmon.mymall.dto.ProductRequest;
import com.coralpersimmon.mymall.model.Product;
import com.coralpersimmon.mymall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }
}
