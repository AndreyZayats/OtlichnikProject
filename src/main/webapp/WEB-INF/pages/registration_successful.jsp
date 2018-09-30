<%@ page import="system.model.User" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nalog
  Date: 26.08.2018
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Успешная регистрация</title>
</head>
<body>
    <spring:form modelAttribute="userFromServer" method="get" action="registration-ok">
        Регистрация завершена успешно. Зарегистрирован пользователь со следующими данными:<br>
        Логин пользователя: ${userFromServer.userLogin} <br>
        Пароль пользователя: ${userFromServer.userPassword} <br>
        Имя пользователя:  ${userFromServer.userName} <br>
        E-mail пользователя: ${userFromServer.userEMail} <br>
        Телефон пользователя: ${userFromServer.userTelephone} <br>
    </spring:form>

</body>
</html>
