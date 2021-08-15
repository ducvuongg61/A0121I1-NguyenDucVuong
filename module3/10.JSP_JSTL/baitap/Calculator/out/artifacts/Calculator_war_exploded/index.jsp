<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/9/2021
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="/calculate" method="post">
    <fieldset>
        <legend>Calculator</legend>
        <table>
            <tr>
                <td>First Operand :</td>
                <td><input type="text" name="firstOperand"/></td>
            </tr>
            <tr>
                <td>First Operand :</td>
                <td><select name="operand">
                    <option value="+">Addition</option>
                    <option value="*">Multiplication</option>
                    <option value="-">Subtraction</option>
                    <option value="/">Division</option>
                </select></td>
            </tr>
            <tr>
                <td>Second Operand :</td>
                <td><input type="text" name="secondOperand"/></td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <button type="submit" value="Calculator">Calculator</button>
                </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
