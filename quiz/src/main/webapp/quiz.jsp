<%--
  Created by IntelliJ IDEA.
  User: bookc
  Date: 10/28/2023
  Time: 11:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Quiz</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            text-align: center;
        }

        h1 {
            color: #0077b5;
        }

        h2 {
            font-size: 1.5em;
            color: #333;
            margin: 20px 0;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: left;
        }

        label {
            display: block;
            margin-bottom: 10px;
        }

        input[type="radio"] {
            margin-right: 10px;
        }

        input[type="submit"] {
            background-color: #0077b5;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #005689;
        }
    </style>
</head>
<body style="background-color: ${cookie.cookie.value}">
<h1>Quiz</h1>
<c:if test="${requestScope.errmsg != null}">
    <p>${requestScope.errmsg}</p>
</c:if>
<h2>${requestScope.question.title}</h2>
<form action="QuizController" method="post">
    <c:forEach items="${requestScope.question.options}" var="option" varStatus="vs">
        <label>
            <input type="radio" name="option" value="${vs.index}"> ${option}<br>
        </label>
    </c:forEach>

    <input type="submit" value="Send">
</form>
</body>
</html>

