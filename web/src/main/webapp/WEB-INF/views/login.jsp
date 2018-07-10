<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<div class="headerBar">
    <div class="loginBar login_logo">
        <div class="comWidth">
            <div class="logo fl">
                <a href="#">这里是logo</a>
            </div>
            <h3 class="welcome_title">欢迎登陆</h3>
        </div>
    </div>
</div>
<div class="loginBox">
    <div class="loginContent">
        <form action="${pageContext.request.contextPath}/person/doLogin" method="post">
            <li>用户名</li>
            <li><input type="text" name="username"></li>
            <li>密码</li>
            <li><input type="password" name="password"></li>
            <li><input type="submit" value="登陆"></li>
        </form>
    </div>
</div>
</body>
</html>
