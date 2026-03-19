package com.coralpersimmon.mymall.dao.impl;

import com.coralpersimmon.mymall.dao.ProductDao;
import com.coralpersimmon.mymall.model.Product;
import com.coralpersimmon.mymall.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Product getProductById(Integer productId) {
        String sql = "SELECT product_id,product_name, category, image_url, price, stock," +
                " description, created_date, last_modified_date FROM product where product_id=:productid";

        Map<String, Object> map = new HashMap<>();
        map.put("productid", productId);

        List<Product> productList = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());

        if (!productList.isEmpty()) {
            return productList.getFirst();
        } else {
            return null;
        }
    }
}
