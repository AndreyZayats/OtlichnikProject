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
    <title>Title</title>
</head>
<body>
    <spring:form modelAttribute="userFromServer" method="post" action="/index/registration">
        <spring:input path="userName"/>
        <spring:input path="userPassword"/>
        <spring:input path="userLogin"/>
        <spring:input path="userEMail"/>
        <spring:input path="userTelephone"/>
        <spring:button>Зарегистрироваться</spring:button>
    </spring:form>
</body>
</html>
