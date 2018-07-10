<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/person/updatePerson" method="post">
    <input type="hidden" name="id" value="${person.id}">
    <li>姓名</li>
    <li><input type="text" name="name" value="${person.name}"></li>
    <li>电话</li>
    <li><input type="text" name="phone" value="${person.phone}"></li>
    <li>地址</li>
    <li><input type="text" name="address" value="${person.address}"></li>
    <li><input type="submit" value="提交修改"></li>
</form>
</body>
</html>
