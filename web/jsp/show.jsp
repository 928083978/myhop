<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/30
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>编号</td>
            <td>班级</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="l">
            <tr>
                <td>${l.bid}</td>
                <td>${l.bname}</td>
                <td><a href="update">修改</a> <a href="../ban/delete?bid=${l.bid}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <form action="../ban/add" method="post">

        姓名:<input type="text" name="bname">

        <input type="submit" value="添加">
    </form>
</body>
</html>
