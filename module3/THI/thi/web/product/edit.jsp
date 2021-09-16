<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 9/1/2021
  Time: 8:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Edit Customer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

    <style>
        table{
            margin-left: 300px;
        }

        footer{
            clear: both;
        }

        .list-group{
            float: left;
        }

        .table1{
            float: left;
            text-align: center;
            margin: 20px auto;
            border-radius: 15px;
        }

        table{
            width: 600px;
            height: 500px;
            border: solid black 1px;
        }

        .p{
            margin-left: 20px;
        }

        td{
            padding-right: 20px;
        }

        a{
            text-decoration: none;
            color: white;
        }

        a:hover{
            color: red;
        }
    </style>
</head>
<body>

<section style="height: 800px">
    <div class="list-group" style="width: 170px; height: 800px; margin-top: 15px" >
        <p class="list-group-item list-group-item-action active" aria-current="true">
            Product
        </p>
        <a href="/product?action=create" class="list-group-item list-group-item-action">Add new product</a>
        <a href="/product?action=list" class="list-group-item list-group-item-action">List product</a>
    </div>

    <div class="table1">
        <form method="POST">
            <table>
                <tr>
                    <td colspan="2" style="text-align: center; font-weight: bold; color: deepskyblue">
                        <h2>EDIT CUSTOMER</h2>
                    </td>
                </tr>

                <tr>
                    <td style="text-align: right;">Product Name</td>
                    <td class="p">
                        <input type="text" name="product_name" value="${product.product_name}" />
                    </td>
                </tr>
                <tr>
                    <td style="text-align: right;">Price</td>
                    <td class="p">
                        <input type="text" name="price" value="${product.price}" />
                    </td>
                </tr>
                <tr>
                    <td style="text-align: right;">Quantity</td>
                    <td class="p">
                        <input type="text" name="quantity" value="${product.quantity}" />
                    </td>
                </tr>
                <tr>
                    <td style="text-align: right;">Color</td>
                    <td class="p">
                        <select class="form-control form-select" name="color" style="width: 200px ; height: 24px; padding: 0 6px;">
                            <option value="1" ${product.color == "Red" ? "selected" : ""}>Red</option>
                            <option value="2" ${product.color == "Green" ? "selected" : ""}>Green</option>
                            <option value="3" ${product.color == "Black" ? "selected" : ""}>Black</option>
                            <option value="3" ${product.color == "White" ? "selected" : ""}>White</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td style="text-align: right;">Category</td>
                    <td class="p">
                        <select class="form-control form-select" name="category" style="width: 200px ; height: 24px; padding: 0 6px;">
                            <option value="1" ${product.category == "Phone" ? "selected" : ""}>Phone</option>
                            <option value="2" ${product.category == "TV" ? "selected" : ""}>TV</option>
                            <option value="3" ${product.category == "Tu Lanh" ? "selected" : ""}>Tu Lanh</option>
                            <option value="4" ${product.category == "May Giat" ? "selected" : ""}>May Giat</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <button type="submit" class="btn btn-secondary">
                            <a>EDIT</a>
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


</body>
</html>
