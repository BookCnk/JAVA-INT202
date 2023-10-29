<%--
  Created by IntelliJ IDEA.
  User: bookc
  Date: 10/28/2023
  Time: 11:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-color: ${cookie.cookie.value}">
    <h1>Your score is ${requestScope.score}</h1>
    <a href="ResetQuizServlet">Reset</a>
</body>
</html>
