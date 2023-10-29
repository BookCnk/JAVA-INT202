<%--
  Created by IntelliJ IDEA.
  User: bookc
  Date: 10/29/2023
  Time: 5:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>setTheam</title>
</head>
<body style="background-color: ${cookie.cookie.value}">
  <h2>select your theam</h2>
  <form action="SetTheamColor"  method="post">
    <input type="radio" name="theme" value="#f5b091">
    <button style="background-color: #f5b091" disabled>Red</button><br>
    <input type="radio" name="theme" value="#baf591">
    <button style="background-color: #baf591" disabled>Green</button><br>
    <input type="radio" name="theme" value="#91cef5">
    <button style="background-color: #91cef5" disabled>Blue</button>
    <br>
    <input type="submit" value="Send" >
  </form>
</body>
</html>
