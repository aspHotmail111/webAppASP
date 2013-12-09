<%--
  Created by IntelliJ IDEA.
  User: b3053632
  Date: 04/12/13
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log On</title>
</head>
<body>
<form id="login" method="post" onsubmit="return checkvalue(this)">
    <h1>Log In</h1>
    <fieldset id="inputs" style="width: 150">
        <div>
            Username: <input name="username" id="username" type="text" placeholder="Username" autofocus required>
        </div>

        <div>
            Password: <input name="password" id="password" type="password" placeholder="Password" required>
        </div>

        <input type="submit" id="submit" value="Log in">
        <a href="/register"><input type="button" value="Sign up"></a>
        <a href="">Forgot password?</a>
    </fieldset>
</form>

<%
    if(request.getAttribute("userNotPresent") != null ){
%>
<p style="color: red">UserName and\or password do not match</p>
<%
    }
%>
</body>
</html>