<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reader Login</title>
</head>
<body>
<br>
<br>
<br>
<br>
<form action="${pageContext.request.contextPath}/login" method="post">
userName:<input type="text" name="username" value="${user.username }"/>
<br>
password:<input type ="text" name="password" value="${user.password }"/>
<br>
Remember me:<input type="checkbox" name="rememberMe" value="Y">
<br>
<input type="submit" value="submit" />
<br>
</form>
<br>
<form action="${pageContext.request.contextPath}/SignUp" method="get" >
<button >Sign Up</button>
</form>
<br>
<a href="#" >Forgot password</a>
</body>
</html>