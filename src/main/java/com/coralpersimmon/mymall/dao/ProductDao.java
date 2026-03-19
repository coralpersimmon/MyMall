package com.coralpersimmon.mymall.dao;

import com.coralpersimmon.mymall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
