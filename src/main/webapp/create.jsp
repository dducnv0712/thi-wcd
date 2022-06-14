<%--
  Created by IntelliJ IDEA.
  User: ducnv
  Date: 14/06/2022
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Phone</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-8 m-auto py-5">
            <a class="mb-2" href="/listphone">back to list</a>
            <div class="card">
                <div class="card-header">
                    <h3>Add Phone</h3>
                </div>
                <div class="card-body">
                    <form action="/createphone" method="post">
                        <div class="form-group mb-3">
                            <label for="name">Name</label>
                            <input type="text" class="form-control" id="name" name="name" placeholder="Enter phone">
                        </div>
                        <div class="row mb-3">
                            <div class="col-5">
                                <label for="brand">Price</label>
                                <select id="brand" class="form-select" name="brand" aria-label="Default select example">
                                    <option selected>Select brand for phone</option>
                                    <option value="SAMSUNG">SAMSUNG</option>
                                    <option value="Apple">Apple</option>
                                    <option value="Nokia">Nokia</option>
                                </select>
                            </div>
                            <div class="col-7">
                                <div class="form-group">
                                    <label for="price">Price</label>
                                    <input type="text" class="form-control" id="price" name="price" placeholder="Enter price">
                                </div>
                            </div>
                        </div>
                        <div class="form-group mb-3">
                            <label for="description">Description</label>
                            <textarea class="form-control" id="description" name="description" rows="3"></textarea>
                        </div>
                        <div class="d-flex">
                            <button type="reset" class="btn btn-danger me-3">Reset</button>
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>

                    </form>

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
