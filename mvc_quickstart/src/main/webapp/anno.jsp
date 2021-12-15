<%--
  Created by IntelliJ IDEA.
  User: Supersource
  Date: 2021/11/15
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>常用注解</h3>
<%--<a href="anno/testRequestParam?name=哈哈">RequestParams</a>--%>
<%--<a href="anno/testRequestBody?name=哈哈">RequestBody</a><br>--%>
<%--<form action="anno/testRequestBody" method="Post">--%>
<%--    用户姓名：<input type="text" name="username"><br>--%>
<%--    用户年龄：<input type="text" name="age"><br>--%>
<%--    <input type="submit" value="提交"><br>--%>
<%--</form>--%>
<%--</body>--%>
<body>
<h3>常用注解</h3>
<%--<a href="anno/testRequestParam?name=哈哈">RequestParams</a>--%>
<a href="anno/testRequestBody?name=哈哈">RequestBody</a><br>
<%--<form action="anno/testRequestBody" method="Post">--%>
<%--    用户姓名：<input type="text" name="username"><br>--%>
<%--    用户年龄：<input type="text" name="age"><br>--%>
<%--    <input type="submit" value="提交"><br>--%>
<%--</form>--%>
    <a href="anno/testPathVariable/110">PathVariable</a><br>
    <a href="anno/testRequestHeader">testRequestHeader</a><br>
    <a href="anno/testCookieValue">testCookieValue</a><br>
<form action="anno/testModelAttribute" method="Post">
    用户姓名：<input type="text" name="uname"><br>
    用户年龄：<input type="text" name="age"><br>
    <input type="submit" value="提交"><br>
</form>
<a href="anno/testSessionAttributes">SessionAttributes</a>
<a href="anno/getSessionAttributes">getSessionAttributes</a>
<a href="anno/delSessionAttributes">delSessionAttributes</a>
</body>
</html>
