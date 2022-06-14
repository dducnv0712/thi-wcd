package com.example.thi_wcd.entity;

public class Product {
    private int id;
    private String name;
    private String brand;
    private double price;
    private String description;

    public Product() {
    }

    public Product(int id, String name, String brand, double price, String description) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static final class ProductBuilder {
        private int id;
        private String name;
        private String brand;
        private double price;
        private String description;

        private ProductBuilder() {
        }

        public static ProductBuilder aProduct() {
            return new ProductBuilder();
        }

        public ProductBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public ProductBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public ProductBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Product build() {
            Product product = new Product();
            product.setId(id);
            product.setName(name);
            product.setBrand(brand);
            product.setPrice(price);
            product.setDescription(description);
            return product;
        }
    }
}
