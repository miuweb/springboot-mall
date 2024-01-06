package com.miuweb.springbootmall.service;

import com.miuweb.springbootmall.model.Product;

public interface ProductService {
  Product getProductById(Integer productId);
}