<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url var="login_url" value="process_login"></c:url>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Log in" %>

</h1>
<form name="login" method="post" action="${login_url}">
    <label>Username :</label>
    <input name="username" type="text">
    <label>Password :</label>
    <input name="password" type="text">
    <input name="submit" type="submit">
</form>

<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>
