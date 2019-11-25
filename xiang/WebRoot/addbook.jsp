<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addbook.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>

  </head>
  
  <body>
      <p>新增图书信息</p>
	<form action="add" method="post"     id="addbook">
	<p>图书名称：<input type="text" id="name" name="name"></p>
	<p>图书作者：<input type="text"  id="author" name="author"></p>
	<p>图书类别：<select name="sortid" >
	<c:forEach items="${sorts}" var="sorts">
	<option value="${sorts.id}">${sorts.name }</option>
	</c:forEach>
	</select></p>
	<p>购买时间：<input type="text"  id="butyime" name="butyime">yyyy-MM-dd格式 </p>
	<p><input type="submit"  value="增加图书"></p>
	</form>
	
	<script type="text/javascript">
	              $("#addbook").submit(function(){
	            	  //图书名称 作者不能为空
	            	  var name=$("#name").val();
	            	  var author=$("#author").val();
	            	  
	            	  if(name=="" || author==""){
	            		  alert("图书名称和作者不能为空");
	            		  return false;
	            	  }
	            	  //日期格式判断
	            	  var butyime=$("#butyime").val();
	            	  //正则表达式
	            	  var regex=/\d{4}-\d{2}-\d{2}/;
	            	  if(!regex.test(butyime)){
	            		  alert("够买日期的格式不对");
	            		  return false;
	            	  } 
	            	  return true;
	              });
	</script>

  </body>
</html>
