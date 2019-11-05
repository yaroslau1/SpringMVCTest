<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 01.11.2019
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>BORAJI.COM</title>
</head>
<body>

<h1>Spring MVC 5 + Spring Security 5 + Hibernate 5 example</h1>
<h4>Login Form</h4>

<form action='<spring:url value="/loginAction"/>' method="post">
    <table>
        <tr>
            <td>Username</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><button type="submit">Login</button></td>
        </tr>
    </table>
</form>
<br/>
</body>
</html>
