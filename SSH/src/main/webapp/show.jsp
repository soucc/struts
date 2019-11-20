<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/19
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>
            姓名
        </td>
        <td>
            性别
        </td>
        <td>
            年龄
        </td>
        <td>
            生日
        </td>
    </tr>
    <c:forEach items="${page.dataList}" var="stu">
        <tr>
            <td>
                ${stu.name}
            </td>
            <td>
                ${stu.sex}
            </td>
            <td>
                ${stu.age}
            </td>
            <td>
                ${stu.birthday}
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
