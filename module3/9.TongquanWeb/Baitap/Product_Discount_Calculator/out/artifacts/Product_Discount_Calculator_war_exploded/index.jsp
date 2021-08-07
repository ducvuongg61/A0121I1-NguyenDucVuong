<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/2/2021
  Time: 10:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
  <style>
    .form input{
      padding: 5px;
    }
  </style>
</head>
<body>
<form action="/discount" method="post" style="margin: 0 auto" class="form">
  <h1>Product Discount Calculator</h1>
  <br/>
  <p>Product Description : </p>
  <input type="text" name="productName" placeholder="Product Name"/>
  <p>List Price : </p>
  <input type="text" name="listPrice" placeholder="List Price"/>
  <p>Discount Percent : </p>
  <input type="text" name="discountPercent" placeholder="Discount Percent"/>
  <br/>
  <input type="submit" value="Calculator Discount" style="margin-top: 5px ">
</form>
</body>
</html>
