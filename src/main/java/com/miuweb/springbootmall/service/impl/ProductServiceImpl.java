package com.miuweb.springbootmall.service.impl;

import javax.validation.Valid;

import com.miuweb.springbootmall.dao.ProductDao;
import com.miuweb.springbootmall.dto.ProductRequest;
import com.miuweb.springbootmall.model.Product;
import com.miuweb.springbootmall.service.ProductService;

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

  
  
}