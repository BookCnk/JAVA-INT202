<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Tasks</title>
</head>
<body>
<h1>All Tasks</h1>
<div>

    <a href="./add-task.jsp">Add Task</a>
</div>
<table border="1">
    <tr>
        <th>Task ID</th>
        <th>Task Name</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${sessionScope.tasks}" var="task">
        <tr>
            <td>${task.id}</td>
            <td>${task.name}</td>
            <td><a href="./edit-task.jsp=${task.id}">Edit</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>