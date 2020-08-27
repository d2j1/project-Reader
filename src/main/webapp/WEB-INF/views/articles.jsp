<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page isELIgnored="false" %>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reader</title>
</head>
<body>

	<c:forEach items="${articles}" var="article" >

	<div>
	<br>
	<form action="${pageContext.request.contextPath}/article_show" method="post" >
	<input type="hidden" name="url" value="${article.url}" />
	<b><button>${article.heading}</a></button>
	<br>
	
	</form>
	<br>
	</div>
	</c:forEach>
	
	<br>
	<br>
	<br>
	
</body>
</html>