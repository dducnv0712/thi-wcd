package com.example.thi_wcd.controllers;

import com.example.thi_wcd.entity.Product;
import com.example.thi_wcd.models.MySqlProductModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/listphone")
public class ProductServlet extends HttpServlet {
    private final MySqlProductModel productModel;
    public ProductServlet() {
        productModel = new MySqlProductModel();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = productModel.getAll();
        request.setAttribute("products", products);
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }
}
