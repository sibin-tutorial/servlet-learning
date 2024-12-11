<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% session.setAttribute("username", "Alice"); %>
<% application.setAttribute("appName", "My Web Application"); %>

<jsp:useBean id="user" class="com.raj.dev.User" scope="session" />
<jsp:setProperty name="user" property="name" value="John" />
<% request.setAttribute("message", "Welcome to the site!"); %>

<!--Displaying a Simple String-->
<h1>${"Hello, World!"}</h1>


<h2>Hello, ${param.name}!</h2>
<h2>Welcome, ${sessionScope.username}!</h2>
<h2>Welcome to ${applicationScope.appName}!</h2>

<h2>Hello, ${user.name}!</h2>

<h1>${requestScope.message}</h2>


<h1>${123 +1 }</h1>
</body>
</html>