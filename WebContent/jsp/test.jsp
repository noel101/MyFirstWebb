<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My JSP</title>
</head>
<body>
 <head> <center>My Firsy JSP </center> </head>
 
 <%
 		int i=3;
 		int j=2;
 		int sum=i+j;
 		System.out.println("The value of i"+i);
 		System.out.println("The value of j"+i);
 		System.out.println("The value of sum"+i+j);
 
 %>
   The value of i is :<%=i %> <br/>
   The value of j is :<%=j %> <br/>
   The value of j is :<%=sum %> 
   
 
</body>
</html>