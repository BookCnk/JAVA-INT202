<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Task</title>
</head>
<body>
<h1>Edit Task</h1>
<form action="EditTaskServlet" method="post">
    <input type="hidden" name="id" value="${param.id}">
    New Task Name: <input type="text" name="name" value="${sessionScope.editTask.name}" required><br>
    <input type="submit" value="Update Task">
</form>
<p>${sessionScope.message}</p>
<a href="all-task.jsp">Back</a>
</body>
</html>
