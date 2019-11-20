<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/15
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

${mess}
<form method="post" action="login">
    user:<input type="text" name="user.user"><br/>
    password:<input type="password" name="user.password"><br/>
    <input type="submit" value="提交">
</form>
<hr/>
<a href="web1"><b>gg</b></a><br/>
<a href="web2"><b>ggcc</b></a>

</body>
</html>
