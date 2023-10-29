<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Update Task</title>
</head>
<body>
<h1>Update Task</h1>
<a href="./all-task.jsp">back</a>
<form action="UpdateTaskServlet" method="post">
  <c:forEach items="${sessionScope.tasks}" var="task">
    Task ID: <input type="text" name="id" value="${task.id}" required><br>
    New Task Name: <input type="text" name="name" value="${task.name}" required><br>
    <input type="submit" value="Update Task">
  </c:forEach>
</form>
<p>${sessionScope.message}</p>
</body>
</html>
