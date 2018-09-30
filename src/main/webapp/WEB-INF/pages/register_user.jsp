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
    <title>Регистрация</title>
</head>
<body>
    <spring:form modelAttribute="userFromServer" method="post" action="registration">
        Логин пользователя: <spring:input path="userLogin"/><br>
        Пароль пользователя: <spring:input path="userPassword"/><br>
        Имя пользователя: <spring:input path="userName"/><br>
        E-mail пользователя: <spring:input path="userEMail"/><br>
        Телефон пользователя: <spring:input path="userTelephone"/><br>
        <spring:button>Зарегистрироваться</spring:button>
    </spring:form>
</body>
</html>
