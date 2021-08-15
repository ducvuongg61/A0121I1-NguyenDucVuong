<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/8/2021
  Time: 9:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%!
    Map<String,String> dic = new HashMap<>();
%>

<%
    dic.put("hello" , "xin chào");
    dic.put("bye" , "tạm biệt");
    dic.put("how" , "thế nào");
    dic.put("what" , "cái gì");

    String search = request.getParameter("word");

    String result = dic.get(search);
    if(result != null){
        out.println("Word : " + search);
        out.println("Result : " + result);
    } else {
        out.println("Not found");
    }
%>
</body>
</html>
