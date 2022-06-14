package com.example.thi_wcd.models;

import com.example.thi_wcd.entity.Product;

import java.util.List;

public interface ProductModel {
    List<Product> getAll();
    Product getById(int id);
    boolean save(Product product);
    boolean update(Product product);
    boolean delete(int id);
}
