<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/18
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    System.out.println(4/0);
%>


${mess}
<form action="login" method="post">
    帐号:<input type="text" name="user" value="admin"><br/>
    密码:<input type="password" name="password" value="111"><br/>
    <input type="submit" value="登陆">
</form>
<br/>
<a href="json">动态获得信息</a><br/>
<a href="json1">动态获得信息</a>
</body>
</html>
