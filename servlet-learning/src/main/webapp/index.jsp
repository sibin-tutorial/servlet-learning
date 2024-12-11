<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is an example of JSP</h1>

<form action="helloServlet" method="post">
Enter Your Name:<input type ="text" name="youName" />
<input type="submit" value="Submit Form"/>

</form>


<form action="example1.jsp" method = "get">

<input type="submit" value="JSP Elements"/>
</form>

<form action="ellearning.jsp" method = "get">
<input type="text" name="name" />
<input type="submit" value="JSP Expression language"/>
</form>

<form action="MyServlet" method = "post">
<input type="submit" value="JSTL Example"/>
</form>

</body>
</html>