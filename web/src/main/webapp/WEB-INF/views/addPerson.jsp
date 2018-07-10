<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加人员</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/person/addPerson" method="post">
    <li>姓名</li>
    <li><input type="text" name="name"></li>
    <li>电话</li>
    <li><input type="text" name="phone"></li>
    <li>地址</li>
    <li><input type="text" name="address"></li>
    <li><input type="submit" value="提交"></li>
</form>
</body>
</html>
