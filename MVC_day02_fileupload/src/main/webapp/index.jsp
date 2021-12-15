<%--
  Created by IntelliJ IDEA.
  User: Supersource
  Date: 2021/11/16
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>文件上传</h3>
<form action="/user/fileUpload01" method="post" enctype="multipart/form-data">
    <input type="file" name="upload"/><br>
    <input type="submit" value="上传"/><br>
</form>

</body>
</html>
