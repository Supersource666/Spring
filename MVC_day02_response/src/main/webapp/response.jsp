<%--
  Created by IntelliJ IDEA.
  User: Supersource
  Date: 2021/11/16
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
  <head>
    <title>Title</title>
    <script src="https://s3.pstatp.com/cdn/expire-1-M/jquery/3.3.1/jquery.min.js"></script>
    <script>
      //页面加载，绑定单击事件
      $(function (){
        $("#btn").click(function (){
            // alert("Hello,buddy");
          $.ajax({
            url:'response/testAjax',
            contentType:'application/json;charSet=UTF-8',
            data:'{"userName":"zhangsan","password":"123456","age":18}',
            dataType:'json',
            type:"post",
            success:function (data) {
              //data服务器端响应的json数据进行解析
              alert(data);
              alert(data.userName);
              alert(data.password);
            }
          });
        });
      });
    </script>
  </head>
  <body>
  <a href="response/testString">testString</a><br>
  <a href="response/testVoid">testVoid</a><br>
  <a href="response/testModelAndView">testModelAndView</a><br>
  <a href="response/testForwardAndRedirect">testForwardAndRedirect</a><br>
  <button id="btn">发送ajax数据</button>
  </body>
</html>
