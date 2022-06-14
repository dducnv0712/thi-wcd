package com.example.thi_wcd.models;

import com.example.thi_wcd.entity.Product;
import com.example.thi_wcd.models.constant.SqlConstant;
import com.example.thi_wcd.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlProductModel implements ProductModel {
    private Connection connection;

    public MySqlProductModel() {
        connection = ConnectionHelper.getConnection();
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_FIND_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt(SqlConstant.PRODUCT_FIELD_ID));
                product.setName(resultSet.getString(SqlConstant.PRODUCT_FIELD_NAME));
                product.setDescription(resultSet.getString(SqlConstant.PRODUCT_FIELD_DESCRIPTION));
                product.setBrand(resultSet.getString(SqlConstant.PRODUCT_FIELD_BRAND));
                product.setPrice(resultSet.getDouble(SqlConstant.PRODUCT_FIELD_PRICE));
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product getById(int id) {
        return null;
    }

    @Override
    public boolean save(Product product) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_INSERT);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getBrand());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setString(4, product.getDescription());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
