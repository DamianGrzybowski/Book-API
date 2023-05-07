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
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
            font-family: Arial, sans-serif;
            font-size: 14px;
            text-align: center;
        }

        th, td {
            padding: 8px;
            border: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #f5f5f5;
        }

        .btn {
            display: inline-block;
            margin: 10px;
            padding: 8px 16px;
            font-size: 16px;
            font-weight: bold;
            color: #fff;
            background-color: #4CAF50;
            border: none;
            border-radius: 4px;
            text-decoration: none;
            text-align: center;
            cursor: pointer;
        }

        .btn:hover {
            background-color: #3e8e41;
        }

        .btn1:hover {
            background-color: cornflowerblue;
        }

        .btn2:hover {
            background-color: firebrick;
        }

        .btn3:hover {
            background-color: lightcoral;
        }
    </style>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Title</th>
        <th>Author</th>
        <th>Details</th>
        <th>Action</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td><a href="/admin/books/details?id=${book.id}" class="btn btn3">Details</a></td>
            <td><a href="/admin/books/update?id=${book.id}" class="btn btn1">Update</a></td>
            <td><a href="/admin/books/delete?id=${book.id}" class="btn btn2">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<a href="/admin/books/add" class="btn">Add new book</a>


</body>
</html>
