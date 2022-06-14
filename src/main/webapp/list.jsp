<%@ page import="java.util.List" %>
<%@ page import="com.example.thi_wcd.entity.Product" %><%--
  Created by IntelliJ IDEA.
  User: ducnv
  Date: 14/06/2022
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Phone</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-8 m-auto py-5">
            <a class="mb-2" href="/createphone">Add a phone</a>
            <div class="card ">
                <div class="card-header">
                    <h3 class="card-title">List Phone</h3>
                </div>
                <div class="card-body">

                    <table class="table">
                        <thead>
                        <tr>
                            <th scope="col">#ID</th>
                            <th>Name</th>
                            <th>Brand</th>
                            <th>Price</th>
                            <th>Description</th>
                        </tr>
                        </thead>
                        <tbody>
                        <%
                            List<Product> products = (List<Product>) request.getAttribute("products");
                            for (Product product : products) {%>

                        <tr>
                            <th scope="row"><%= product.getId() %>
                            </th>
                            <td><%= product.getName() %>
                            </td>
                            <td><%= product.getBrand() %>
                            </td>
                            <td><%= product.getPrice() %>
                            </td>
                            <td><%= product.getDescription() %>
                            </td>
                        </tr>
                        <%}%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
        crossorigin="anonymous"></script>
</html>
