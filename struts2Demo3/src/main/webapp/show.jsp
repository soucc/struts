<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/15
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>

    <title>Title</title>
</head>
<body>
<s:debug></s:debug>
${mess}
<hr/>
${requestScope.get("req")}
${sessionScope.get("session")}
${applicationScope.get("application")}
${valueStack}
<hr/>
</body>
</html>
