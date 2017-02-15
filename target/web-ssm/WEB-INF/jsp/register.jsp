<%--
  Created by IntelliJ IDEA.
  User: sijingl
  Date: 2017-01-18
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- register.jsp 注册展示页面-->
<form method="post">
    username:<input type="text" name="userName" value="${user.userName}"><br/>
    password:<input type="password" name="password"><br/>
    city:<select>
    <c:forEach items="${cityList}" var="city">
        <option>${city}</option>
    </c:forEach>
</select><br/>
    <input type="submit" value=" 注册 "/>
    <input type="submit" name="_cancel" value=" 取消 "/>
</form>
</body>
</html>
