<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/20/2021
  Time: 8:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Create new user</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <style>
        table {
            margin-left: 300px;
        }

        footer {
            clear: both;
        }

        .list-group {
            float: left;
        }

        .table1 {
            float: left;
            text-align: center;
            margin: 20px auto;
            border-radius: 15px;
        }

        table {
            width: 600px;
            height: 500px;
            border: solid black 1px;
        }

        /*td{*/
        /*    padding-right: 20px;*/
        /*}*/
    </style>
</head>
<body>

<section style="height: 800px">
    <div class="list-group" style="width: 170px; height: 800px; margin-top: 15px">
        <p class="list-group-item list-group-item-action active" aria-current="true">
            Product
        </p>
        <a href="/product?action=create" class="list-group-item list-group-item-action">Add new product</a>
        <a href="/product?action=list" class="list-group-item list-group-item-action">List product</a>
    </div>

    <div class="table1">
        <form method="post">
            <table>
                <tr>
                    <td colspan="3" style=" font-weight: bold; color: deepskyblue">
                        <h2 style="margin-left: 70px">CREATE NEW CUSTOMER</h2>
                    </td>
                </tr>
                <tr>
                    <td style="text-align: right;">Product Name</td>
                    <td style="margin-left: 30px">
                        <input type="text" name="product_name" placeholder="Enter product name" required
                               style="margin-left: 30px"/>
                    </td>
                    <td>

                    </td>
                </tr>
                <tr>
                    <td style="text-align: right;">Price</td>
                    <td style="margin-left: 30px">
                        <input type="text" name="price" placeholder="Enter price" required
                               style="margin-left: 30px"/>
                    </td>
                    <td>

                    </td>
                </tr>
                <tr>
                    <td style="text-align: right;">Quantity</td>
                    <td style="margin-left: 30px">
                        <input type="text" name="quantity" placeholder="Enter quantity" required
                               style="margin-left: 30px"/>
                    </td>
                    <td>

                    </td>
                </tr>
                <tr>
                    <td style="text-align: right;">Color</td>
                    <td style="margin-left: 30px">
                        <select class="form-control form-select" required name="color"
                                style="margin-left: 30px; width: 200px ; height: 24px; padding: 0 6px;">
                            <option value="Red">Red</option>
                            <option value="Green">Green</option>
                            <option value="Black">Black</option>
                            <option value="White">White</option>
                        </select>
                    </td>
                    <td>

                    </td>
                </tr>
                <tr>
                    <td style="text-align: right;">Category</td>
                    <td style="margin-left: 30px">
                        <select class="form-control form-select" required name="category"
                                style="margin-left: 30px; width: 200px ; height: 24px; padding: 0 6px;">
                            <option value="Phone">Phone</option>
                            <option value="TV">TV</option>
                            <option value="Tu Lanh">Tu Lanh</option>
                            <option value="May Giat">May Giat</option>
                        </select>
                    </td>
                    <td>

                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <button type="submit" class="btn btn-secondary">
                            <a>CREATE</a>
                        </button>
                        <button type="button" class="btn btn-secondary">
                            <a href="/product?action=list">BACK</a>
                        </button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</section>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
