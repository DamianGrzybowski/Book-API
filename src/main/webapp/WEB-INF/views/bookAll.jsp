<%--
  Created by IntelliJ IDEA.
  User: Damian Grzybowski
  Date: 07.05.2023
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All books</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Title</th>
        <th>Author</th>
        <th>Publisher</th>
        <th>Type</th>
        <th>ISBN</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.publisher}</td>
            <td>${book.type}</td>
            <td>${book.isbn}</td>
            <td><a href="/admin/books/update?id=${book.id}">Update</a></td>
            <td><a href="/admin/books/delete?id=${book.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>
