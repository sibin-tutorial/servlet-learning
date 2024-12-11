<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- c:out - Display Data -->
<h1><c:out value="${username}" /></h1>

<!--  c:if - Conditional Statements -->
<c:if test="${isAdmin}">
    <h1>Welcome, Admin</h1>
</c:if>

<!-- c:choose, c:when, c:otherwise - Conditional Logic
 -->
 
 <c:choose>
    <c:when test="${userbean.role == 'Admin'}">
        <h1>Welcome admin</h1>
    </c:when>
    <c:when test="${userbean.role == 'Editor'}">
   <h1>Welcome editor</h1>
    </c:when>
    <c:otherwise>
           <h1>Welcome student</h1>
    </c:otherwise>
</c:choose>


<!-- c:forEach - Iteration -->
<ul>
    <c:forEach var="fruit" items="${fruitList}">
        <li>${fruit}</li>
    </c:forEach>
</ul>
</body>
</html>