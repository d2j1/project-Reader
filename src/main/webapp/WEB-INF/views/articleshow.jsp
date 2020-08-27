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
<div>
<h1>"${heading}"</h1>
<br>
<br>
<img src="${img_url }" alt="" />
<br>
<br>
<c:if test="${text==null }">
<div>there is no text to show here kindly check original page by clicking below link</div>
<a href="${url}"><button>View Original</button></a>
</c:if>
<div>${text}</div>
<br>
<br>
</div>
</body>
</html>