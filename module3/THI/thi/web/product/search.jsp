<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/18/2021
  Time: 10:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List Product</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
            crossorigin="anonymous"
    />

    <style>

        body{
            font-family: "Times New Roman", Times, serif;
        }

        table{
            margin-left: 30px;
        }

        .list-group{
            float: left;
        }

        .table1{
            float: left;
        }

        section{
            margin-top: 15px;
        }

        footer{
            clear: both;
        }
    </style>
</head>
<body>


<section style="height: 815px">

    <div class="list-group" style="width: 170px; height: 800px;" >
        <p class="list-group-item list-group-item-action active" aria-current="true">
            Product
        </p>
        <a href="/product?action=create" class="list-group-item list-group-item-action">Add new product</a>
        <a href="/product?action=list" class="list-group-item list-group-item-action">List product</a>
    </div>

    <div class="table1" style="text-align: center">
        <form method="post">
            <h2>LIST CUSTOMER</h2>

            <div class="find"> Search product by name :
                <input type="text" name="product_name" placeholder="Search By Name..." class="round" style="border-radius: 20px; font-size: 15px;"  size="30px;"/>
                <button type="submit" class="btn btn-dark">
                    <a>SEARCH</a>
                </button>
            </div>

            <table class="table table-striped" style="width: 1100px ; margin-top: 20px">
                <thead>
                <tr>
                    <th scope="col">STT</th>
                    <th scope="col">ProductName</th>
                    <th scope="col">Price</th>
                    <th scope="col">Quantity</th>
                    <th scope="col">Color</th>
                    <th scope="col">Category</th>
                    <th scope="col">Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="product" items="${listProduct}">
                    <tr>
                        <th scope="row"><c:out value="${product.id}"/> </th>
                        <td scope="row"><c:out value="${product.product_name}"/> </td>
                        <td scope="row"><c:out value="${product.price}"/> </td>
                        <td scope="row"><c:out value="${product.quantity}"/> </td>
                        <td scope="row"><c:out value="${product.color}"/> </td>
                        <td scope="row"><c:out value="${product.category}"/> </td>
                        <td scope="row" style="width: 250px">
                            <div class="container-fluid">
                                <button class="btn btn-warning" style="width: 100px;">
                                    <a href="/product?action=update&id=${product.id}">EDIT</a>
                                </button>

                                <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#flipFlop${product.id}" style="width: 90px;">
                                    <a class="abc">DELETE</a>
                                </button>

                                <!-- The modal -->
                                <div class="modal fade" id="flipFlop${product.id}" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
                                    <div class="modal-dialog" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h4 class="modal-title" id="modalLabel">WARNING!</h4>
                                            </div>
                                            <div class="modal-body">DO YOU WANT TO DELETE ProductName <c:out value="${product.product_name}"/> ? </div>
                                            <div class="modal-footer">
                                                <button type="submit" class="btn btn-danger" style="width: 100px;">
                                                    <a href="/product?action=delete&id=${product.id}">DELETE</a>
                                                </button>
                                                <button type="button" class="btn btn-secondary" data-dismiss="modal" style="width: 100px">CLOSE</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>


                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </form>

    </div>
</section>


</body>
</html>
