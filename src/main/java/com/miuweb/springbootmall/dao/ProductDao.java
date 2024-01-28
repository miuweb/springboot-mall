package com.miuweb.springbootmall.dao;

import com.miuweb.springbootmall.dto.ProductRequest;
import com.miuweb.springbootmall.model.Product;

public interface ProductDao {

  Product getProductById(Integer productId);

  Integer createProduct(ProductRequest productRequest);
  
}