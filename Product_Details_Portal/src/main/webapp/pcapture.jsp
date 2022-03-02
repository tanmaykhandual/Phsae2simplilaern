<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<jsp:useBean id="index" class="com.simplilearn.pdetails_portal.Product" scope="session"/>
	<jsp:setProperty property="id" name="index"/>  
	<jsp:setProperty property="pname" name="index"/>  
	<jsp:setProperty property="ptype" name="index"/>  
	<jsp:setProperty property="pprice" name="index"/>  <br><br>
	
<b><h2>
<center><a href = "detail.jsp"> Click here to get the Product Details</a></center></h2></b><br><br>

</body>
</html>
