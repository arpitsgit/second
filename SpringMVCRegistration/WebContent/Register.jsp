<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register here</title>
</head>
<body>
<h1>Registration page</h1>
<form action="register.do" method="post">
<pre>
User Name :<input type="text" name="uname">
Email Id  :<input type="text" name="emailid">
Phone NO  :<input type="number" name="phoneno">
Password  :<input type="password" name="pass">
Confirm Password:<input type="password" name="cpass">
Country   :<select name="country">
	<option value="India">India</option>
	<option value="Dubai">Dubai</option>
	<option value="Thiland">USA</option>
			</select>
			<br></br>
<input type="submit" value="Register">

<a href="Login.jsp">click here to Login</a>

</pre>
</form>

</body>
</html>