<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="myprefix" uri="WEB-INF/message.tld"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!-- Scriptlet (<% %>) -->


<h1><%out.println("This is an example of scriptlet"); %></h1>

<h1><%
int age = 7;
out.println("My age is:"+age);
%></h1>
<h1>
<%
for(int i=0;i<5;i++){
	out.println(i);
}
%>

<!-- Uisng expression -->
<!-- Current time -->
<h1>The current year is: <%= java.time.Year.now() %></h1>
</h1>

<!-- Declaration  -->
<%! public int i = 9; 
  public void printAString(){
	 // out.println("Hii");
  }

%>

<!-- Uisng java bean example -->
<!-- Create or access the JavaBean -->
    <jsp:useBean id="user" class="com.raj.dev.User" scope="page" />


 <!-- Set properties of the JavaBean -->
    <jsp:setProperty name="user" property="name" value="John Doe" />
    <jsp:setProperty name="user" property="email" value="John@gmail.in" />


<!-- Get properties of the JavaBean -->
    <h2>Name: <jsp:getProperty name="user" property="name" /></h2>
    <h2>Email: <jsp:getProperty name="user" property="email" /></h2>

 <myprefix:MyMsg/>

</body>
</html>