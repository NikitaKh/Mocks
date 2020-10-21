<%@page import="ru.ibs.logic.Model" %>

<%--
  Created by IntelliJ IDEA.
  User: nikitakhvalin
  Date: 21.10.2020
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home page</title>
</head>

<body>
<h1>Домашная страница по работе с пользователями!</h1>
Введите id пользователя (0 - для вывода всего списка пользователей)
<br/>
Доступно: <%
    Model model = Model.getInstance();
    out.print(model.getFromList().size());
%>
<form method="get" action="get">
    <label>
        ID:
        <input type="text" name="id">
        <br/>
    </label>
    <button type="submit">Поиск</button>
</form>

<a href="addUser.html">Создание нового пользователя!</a>
</body>
</html>
