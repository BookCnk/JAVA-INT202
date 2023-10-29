<%--
  Created by IntelliJ IDEA.
  User: bookc
  Date: 10/29/2023
  Time: 12:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Question</title>
</head>
<body>
<h1>Addition Quiz Status : ${countCorrectAnswer} / ${countTotal} </h1>
<form action="QuestionServlet" method="post">

    <label>
        What is ${num1} + ${num2} =
        <input type="text" name="userAnswer">   <%--You will get the information you entered.--%>
        <input type="submit" value="Submit">
    </label>
</form>
<c:if test="${message != null}">
    <h3>${message}</h3>
</c:if>
<c:if test="${correctMessage!= null}">
    <h3>${correctMessage}</h3>
</c:if>
<c:if test="${congratsMessage != null}">
    <h3>${congratsMessage}</h3>   
</c:if>

<p>develop BY CNK</p>

</body>
</html>
