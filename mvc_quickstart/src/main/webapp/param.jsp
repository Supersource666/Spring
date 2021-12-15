<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Tittle</title></head>
<body>
<%--&lt;%&ndash;请求参数绑定&ndash;%&gt;--%>
<%--中文乱码拦截request.setChar--%>
<%--<a href="param/testParam?username=weiwei&password=123">请求参数绑定</a>--%>
<%--请求参数绑定，将属性值存放在JavaBean对象中--%>
<%--<form action="param/saveAccount" method="Post">--%>
<%--姓名：<input type="text" name="userName"><br>--%>
<%--密码：<input type="text" name="password"><br>--%>
<%--金额：<input type="text" name="money"><br>--%>
<%--用户姓名：<input type="text" name="user.uname"><br>--%>
<%--用户年龄：<input type="text" name="user.age"><br>--%>
<%--<input type="submit" value="提交"><br>--%>
<%--</form>--%>
<%--把数据封装Account类中，类中存在Map和List--%>
<%--<form action="param/saveAccount" method="Post">--%>
<%--姓名：<input type="text" name="userName"><br>--%>
<%--密码：<input type="text" name="password"><br>--%>
<%--金额：<input type="text" name="money"><br>--%>
<%--用户姓名：<input type="text" name="List[0].uname"><br>--%>
<%--用户年龄：<input type="text" name="List[0].age"><br>--%>
<%--用户姓名：<input type="text" name="Map['one'].uname"><br>--%>
<%--用户年龄：<input type="text" name="Map['one'].age"><br>--%>
<%--<input type="submit" value="提交"><br>--%>
<%--</form>--%>
<%--自定义类型转化器--%>
<%--<form action="param/saveUser" method="Post">--%>
<%--    用户姓名：<input type="text" name="uname"><br>--%>
<%--    用户年龄：<input type="text" name="age"><br>--%>
<%--    用户生日：<input type="text" name="date"><br>--%>
<%--    <input type="submit" value="提交"><br>--%>
<%--</form>--%>
<%--获取原生的API--%>
<a href="anno/testRequestParam">获取原生API</a>
</body>
</html>
