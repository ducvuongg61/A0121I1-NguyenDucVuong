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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
          crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.11.1/datatables.min.css">

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

        .abc{
            margin:  0;
            padding: 0;
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
        <a href="/product?action=search" class="list-group-item list-group-item-action">Search product</a>
    </div>

    <c:if test="${empty listProduct}">
        <h2 style="font-weight: bold; color: red">This list is empty</h2>
    </c:if>

    <c:if test="${not empty listProduct}">
        <div class="table1" style="text-align: center">
            <form method="post">
                <h2>LIST PRODUCT</h2>

                <table id="list" class="display table table-striped" style="width: 1200px ; margin-top: 20px">
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
    </c:if>


</section>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
        crossorigin="anonymous"></script>
<script type="text/javascript" src="https://cdn.datatables.net/v/bs4/dt-1.11.1/datatables.min.js"></script>

<script>
    $(document).ready(function() {
        $('#list').DataTable( {
            "lengthMenu": [[3, 5, 10, -1], [3, 5, 10, "All"]]
        } );
    } );
</script>

</body>
</html>
