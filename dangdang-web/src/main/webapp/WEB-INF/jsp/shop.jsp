<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/7
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title></title>
  <link type="text/css" rel="stylesheet" href="css/style.css" />
 <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.min.js"></script>
</head>
<body>
<div id="header" class="wrap">
  <div id="logo">合众艾特网上书城</div>
  <div id="navbar">
    <div class="userMenu">
      <ul>
        <li><a href="index.html">User首页</a></li>
        <li><a href="orderlist.html">我的订单</a></li>
        <li class="current"><a href="shopping.html">购物车</a></li>
        <li><a href="#">注销</a></li>
      </ul>
    </div>
    <form method="get" name="search" action="">
      搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
    </form>
  </div>
</div>
<div id="content" class="wrap">
  <div class="list bookList">
    <form method="post" name="shoping" action="shopping-success.html">
      <table>
        <tr class="title">
          <th class="view">图片预览</th>
          <th>书名</th>
          <th class="nums">数量</th>
          <th class="price">价格</th>
          <th >小计</th>
          <th>操作</th>
        </tr>
        <c:forEach items="${car}" var="k">
        <tr>
          <input type="hidden" name="bookVoId"  class="id" value="${k.value.bookPic}">
          <td class="thumb"><img src="${k.value.bookPic}" height="150" /></td>
          <td class="title" style="align-content: center">${k.value.bookName}</td>
          <td><input class="input-text"  type="text" name="nums" value="${k.value.bookCount}" /></td>
          <td>￥<span>${k.value.bookPrice}</span></td>
          <td>￥<span class="xiaoji">${k.value.bookPrice*k.value.bookCount}</span></td>
          <td><input type="button" value="删除" class="shan"></td>
        </tr>
        </c:forEach>
      </table>
      <div class="button">
        <h4>总价：￥<span class="zongjia">65.00</span>元</h4>
        <input class="input-chart" type="submit" name="submit" value="" />
      </div>
    </form>
  </div>
</div>
<div id="footer" class="wrap">
  合众艾特网上书城 &copy; 版权所有

</div>

<script type="text/javascript">
  var s=$(".id").val;
  $(function(){
    $(".shan").click(function(){
      confirm("是否确认删除");
      $("shanBooks",{"bookId":s},function(data){
        if(data==1){
          alert("删除成功");
          location.reload();
        }
        else
          alert("删除失败");
        location.reload();
      });
    });
  });

</script>
</body>
</html>
