<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/14
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${mess}
<form action="login" method="get">
    user:<input type="text" value="admin" name="user"><br/>
    password:<input type="password" value="111111" name="password"><br/>
    <input type="submit" value="提交">
</form>
<br/>
<form action="add" method="get" >
    id:<input type="text" value="1001" name="stu.id"><br/>
    name:<input type="text" value="李思思" name="stu.name"><br/>
    sex:<input type="text" value="女" name="stu.sex"><br/>
    age:<input type="text" value="18" name="stu.age"><br/>
    <input type="submit" value="提交">
</form>
<br/>
<form action="adds" method="get" >
    id:<input type="text" value="1002" name="id"><br/>
    name:<input type="text" value="李思思2" name="name"><br/>
    sex:<input type="text" value="女2" name="sex"><br/>
    age:<input type="text" value="18" name="age"><br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
