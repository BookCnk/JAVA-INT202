<%--
  Created by IntelliJ IDEA.
  User: God_5
  Date: 10/29/2022
  Time: 10:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>AdditionQuiz</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        h1 {
            font-size: 24px;
            color: #0077b5;
            margin: 20px 0;
        }

        form {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            max-width: 400px;
            margin: 0 auto;
            text-align: left;
        }

        label {
            display: block;
            font-size: 18px;
            margin-bottom: 10px;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            background-color: #0077b5;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.2s;
            margin: 10px;
        }

        input[type="submit"]:hover {
            background-color: #005689;
        }

        h3 {
            font-size: 20px;
            color: #0077b5;
            margin: 20px 0;
        }

        p {
            font-size: 14px;
            color: #777;
            margin: 20px 0;
        }

    </style>
</head>
<body>
<h1>Addition Quiz Status : ${countCorrectAnswer}/${countTotal}</h1>
<form action="QuestionServlet" method="post">
    <label>
        What is ${num1} + ${num2} =
        <input type="text" name="userAnswer">
        <input type="submit" value="Submit">
    </label>
</form>
<c:if test="${not empty message}">
    <h3>${message}</h3>
</c:if>
    <c:if test="${not empty correctMessage}">
        <h3>${correctMessage}</h3>
    </c:if>
    <c:if test="${not empty congratsMessage}">
        <h3>${congratsMessage}</h3>
    </c:if>

<br>
<br>
<p>Developed by Tanasit Aintakhan</p>
</body>
</html>
