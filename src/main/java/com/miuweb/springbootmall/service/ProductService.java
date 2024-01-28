package com.miuweb.springbootmall.service;

import javax.validation.Valid;

import com.miuweb.springbootmall.dto.ProductRequest;
import com.miuweb.springbootmall.model.Product;

public interface ProductService {
  Product getProductById(Integer productId);
  Integer createProduct(ProductRequest productRequest);
}