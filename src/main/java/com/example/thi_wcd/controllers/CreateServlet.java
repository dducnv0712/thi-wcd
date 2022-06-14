package com.example.thi_wcd.controllers;

import com.example.thi_wcd.entity.Product;
import com.example.thi_wcd.models.MySqlProductModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreateServlet", value = "/createphone")
public class CreateServlet extends HttpServlet {
    private final MySqlProductModel productModel;
    public CreateServlet() {
        productModel = new MySqlProductModel();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        String brand = request.getParameter("brand");
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setBrand(brand);
        boolean result = productModel.save(product);
        if(result) {
            response.sendRedirect("/listphone");
        }else {
            request.getRequestDispatcher("/create.jsp").forward(request, response);
        }
    }
}
