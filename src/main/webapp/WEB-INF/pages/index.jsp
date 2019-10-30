<%--
  Created by IntelliJ IDEA.
  User: samoilovich_y
  Date: 23.01.2019
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
    <link href="resources/css1/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css1/bootstrap-theme.min.css" rel="stylesheet">
    <link href="resources/css1/mystyles.css" rel="stylesheet">
    <link href="resources/css1/font-awesome.min.css" rel="stylesheet">
    <link href="resources/css1/bootstrap-social.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">list of cities</a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="http://localhost:8081/index.jsp">Show all</a></li>

            <li class="active"><a href="#"><span class="glyphicon glyphicon-log-in"
                                                 aria-hidden="true"></span> Log in</a></li>
            <li><a href="http://localhost:8081/signin.jsp">Sign in</a></li>
            <li><a href="http://localhost:8081/controller">Get All Cities</a></li>
            <li><a href="http://localhost:8081/users.jsp">Users</a></li>
        </ul>
    </div>
</nav>
<br/><br/><br/>
<div class="col-xs-12 col-sm-9">
    <form class="form-horizontal" role="form" method="GET" action="/richest">
        <div class="form-group">
            <label for="name" class="col-sm-2 control-label">richest user's name : </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="name" name="name"
                      value="${id}">
            </div>
        </div>
        <div class="form-group">
            <label for="pass" class="col-sm-2 control-label">Sum account : </label>
            <div class="col-sm-10">
                <input type="text"  id="pass" name="pass"
                      value="${sum}">
            </div>
        </div>
        <p></p>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary">Get value</button>
            </div>
        </div>
    </form>
</div>



<br/><br/><br/>



</body>
</html>
