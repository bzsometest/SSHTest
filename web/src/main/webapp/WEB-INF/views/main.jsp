<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查看人员</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>姓名</th>
        <th>手机号</th>
        <th>地址</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="p" items="${persons}">
        <tr>
            <td>${p.name}</td>
            <td>${p.phone}</td>
            <td>${p.address}</td>
            <td><a href="/person/updatePrompt?id=${p.id}">修改</a><a href="/person/deletePersonById?id=${p.id}" onclick="return confirm('确认删除吗')">删除</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
