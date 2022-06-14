package com.example.thi_wcd.models.constant;

public class SqlConstant {
    public static final String PRODUCT_FIELD_ID = "id";
    public static final String PRODUCT_FIELD_NAME = "name";
    public static final String PRODUCT_FIELD_DESCRIPTION = "description";
    public static final String PRODUCT_FIELD_PRICE = "price";
    public static final String PRODUCT_FIELD_BRAND = "brand";

    public static final String PRODUCT_INSERT = "INSERT INTO products (name, brand, price,description) VALUES (?,?,?,?);";
    public static final String PRODUCT_FIND_ALL = "SELECT * FROM products;";


}
