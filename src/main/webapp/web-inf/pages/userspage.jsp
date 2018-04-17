<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: KotoSovik
  Date: 13.04.2018
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HomePAge</title>
</head>
<body>
are you admin?<br>
set your LP for checking.

<spring:form modelAttribute="userFromServer" method="post"
             action="/users/check"><%--action это уже ответ на нажатие кнопки--%>  <%--если перед /users у нас есть еще путь в виде контекста из помника то его тоже пишем --%>
    <spring:input path="name"/><br>
    <spring:input path="password"/><br>
    <spring:button>check user</spring:button>
</spring:form>
</body>
</html>
