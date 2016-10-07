<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/6
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title></title>
  <link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
<div id="header" class="wrap">
  <div id="logo">合众艾特网上书城</div>
  <div id="navbar">
    <form method="get" name="search" action="">
      搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
    </form>
  </div>
</div>
<div id="register">
  <div class="title">
    <h2>欢迎注册合众艾特网上书城</h2>
  </div>
  <div class="steps">
    <ul class="clearfix">
      <li class="current">1.填写注册信息</li>
      <li class="unpass">2.注册成功</li>
    </ul>
  </div>
  <form method="post" id="hah" >
    <dl>
      <dt>用 户 名：</dt>
      <dd><input class="input-text" type="text" name="userName" id="a1"/><span>当前用户已存在！</span></dd>
      <dt>密　　码：</dt>
      <dd><input class="input-text" type="password" name="passWord" id="a2"/><span>密码过于简单！</span></dd>
      <dt>确认密码：</dt>
      <dd><input class="input-text" type="password" name="passWord" id="a3" /><span>两次密码输入不一致！</span></dd>
      <dt>Email地址：</dt>
      <dd><input class="input-text" type="text" name="email" id="a4"/><span>邮箱输入不正确！</span></dd>
      <dt></dt>
      <dd class="button"><input id="a5" type="button" name="register" value="注册" /></dd>
    </dl>
  </form>
</div>
<div id="footer" class="wrap">
  合众艾特网上书城 &copy; 版权所有

</div>
<script src="../js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
  $(function(){
    $("#a5").click(function(){
      $.post("add",$("#hah").serialize(),function(date){
        if(data==1){
            alert("注册成功");
            location="addok";
        }
        else{
           alert("注册失败");
           location.reload();
        }

      });
    });
  });

</script>

</body>
</html>
