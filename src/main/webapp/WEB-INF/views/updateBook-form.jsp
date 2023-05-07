
<%--
  Created by IntelliJ IDEA.
  User: Damian Grzybowski
  Date: 07.05.2023
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Update book</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<form:form method="post" action="/admin/books/update" modelAttribute="bookToUpdate">

    <form:hidden path="id"/>

    <label for="tilte">Title</label>
    <form:input path="title" id="tilte"/><br>
    <form:errors path="title" cssClass="error"/><br>

    <label for="author">Author</label>
    <form:input path="author" id="author"/><br>
    <form:errors path="author" cssClass="error"/><br>

    <label for="publisher">Publisher</label>
    <form:input path="publisher" id="publisher"/><br>
    <form:errors path="publisher" cssClass="error"/><br>

    <label for="type">Type</label>
    <form:input path="type" id="type"/><br>
    <form:errors path="type" cssClass="error"/><br>

    <label for="isbn">ISBN</label>
    <form:input path="isbn" id="isbn"/><br>
    <form:errors path="isbn" cssClass="error"/><br>

    <input type="submit">


</form:form>

</body>
</html>
