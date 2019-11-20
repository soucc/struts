<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/19
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>用户信息管理系统</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="../../js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="../../js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <h3 style="text-align: center">用户信息列表</h3>

    <form action="selectall" method="post">
        姓名:<input type="text" name="name">
        年龄:<input type="text" name="minage">--
        <input type="text" name="maxage">
        <input type="submit" value="搜索">
    </form>
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>生日</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${page.dataList}" var="stu">
            <tr>
                <td>
                    ${stu.id}
                </td>
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
                    <fmt:formatDate value="${stu.birthday}" type="date" pattern="yyyy-MM-dd" dateStyle="medium"/>
                </td>
                <td>
                    <a class="btn btn-default btn-sm" href="update?id=${stu.id}">修改</a>&nbsp;<a class="btn btn-default btn-sm" href="">删除</a>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="8" align="center"><a class="btn btn-primary" href="add.html">添加联系人</a></td>
        </tr>
        <tr>
            <td colspan="1" align="center">
            <a href="selectall?currentPage=1&name=${map.name}&minage=${map.minage}&maxage=${map.maxage}">
            首页
            </a>
            </td>

            <td colspan="1" align="center">
            <a href="selectall?currentPage=${page.currentPage-1}&name=${map.name}&minage=${map.minage}&maxage=${map.maxage}" >
                上一页
            </a>
            </td>

            <td colspan="1" align="center">
            <a href="selectall?currentPage=${page.currentPage+1}&name=${map.name}&minage=${map.minage}&maxage=${map.maxage}">
                下一页
            </a>
            </td>


            <td colspan="1" align="center">
            <a href="selectall?currentPage=${page.pageCount}&name=${map.name}&minage=${map.minage}&maxage=${map.maxage}" >
                尾页
            </a>
            </td>
        </tr>
    </table>


</div>
</body>
</html>


