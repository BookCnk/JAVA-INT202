<%--
  Created by IntelliJ IDEA.
  User: bookc
  Date: 10/28/2023
  Time: 12:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Multiplication Table</title>
    <style>
        /* Styles for the body */
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
        }

        /* Styles for the h3 heading */
        h3 {
            color: #0077b5;
        }

        /* Styles for the hr element */
        hr {
            border: 2px solid #0077b5;
        }

        /* Styles for the table */
        table {
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        /* Styles for table headers */
        th {
            background-color: #0077b5;
            color: #fff;
            padding: 10px;
        }

        /* Styles for table cells */
        td {
            padding: 8px;
            text-align: center;
        }

        /* Alternate row background color */
        tr:nth-child(odd) {
            background-color: #f7f7f7;
        }
    </style>
</head>
<body>
<h3>Multiplication Table :: </h3>
<hr>
<c:if test="${error == null}">
    <table>
        <tr>
            <th colspan="5">MT for ${param.number}</th>
        </tr>
        <c:forEach begin="1" end="12" var="n">
            <tr>
                <td>${param.number}</td>
                <td>x</td>
                <td>${n}</td>
                <td>=</td>
                <td>${n * param.number}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<%--show output have err if have err value != null--%>
<c:if test="${error != null}">
    <h3>Error: ${requestScope.error} (${param.number != null || param.number == '' ? param.number : "null/Empty"})</h3>
</c:if>
</body>
</html>

