<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login here</title>
</head>
<body bgcolor="cyan">
<form action="login.do" method="post">
<pre>
<h1>Login Page...</h1>
Email Id :<input type="text" name="emailid"/><br>
PassWord :<input type="password" name="pass"/><br>

<input type="submit" value="Login">
${msg}
<a href="Forgot.jsp">Click here to Forgot PassWord</a>
<a href="Register.jsp">Click here to Register</a>

</pre>
</form>
</body>
</html>
