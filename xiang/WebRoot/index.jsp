<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
  </head>
  <style>
    a{
    text-decoration:none
    }
    li{
    list-style:none
    }
    
  </style>
  <body >
      <p><a href="addbook">添加书籍</a></p>
    <table  border="1" width="95%" style="margin:10px auto;">
      <tr>
      <td></td>
      <td>图书名称</td>
      <td>图书分类</td>
      <td>图书作者</td>
      <td>购买时间</td>
      <td>操作</td> 
      </tr>
    <c:forEach items="${books}" var="b" varStatus="vs">
    <tr  <c:if test="${vs.count%2==0}">style="background:#ccc;"</c:if>      >
      <td>${vs.count}</td>
      <td>${b.name}</td>
      <td>${b.sortname}
      </td>
      <td>${b.author}</td>
      <td>${b.butyime}</td>
      <td><a href="javascript:void(0);" onclick="delbook(${b.id})">删除</a></td> 
      </tr>
        </c:forEach >
      <td colspan="6">
           【${currNo}/${totalPage}】
      <c:if test="${currNo>1}">
        			<a  href="findall/?currNo=1">
                        <span >首页</span></a>   
                    <a  href="findall/?currNo=${currNo-1}">
                        <span >上一页</span></a>              
                </c:if>
        <c:if test="${currNo<totalPage}">
                    <a  href="findall/?currNo=${currNo+1}">
                        <span>下一页</span></a>     
                 <a  href="findall/?currNo=${totalPage}">
                        <span>尾页</span></a>                      
                </c:if>      
         总记录数：${totalCount}            
     </td>
       </table>  
    
        <script type="text/javascript">
  
  function delbook(id){
	 if(confirm("确定要删除吗?")){
		 $.ajax({
				"url":"delbook",
				"type":"POST",
				"data":{
					"id":id
				},
				"dataType":"json",
				"success":function(result){
					if(result.msg=="true"){
						//刷新列表
						location.href='findall';
					}else{
						alert("删除失败!");	
					}
				}
			});
	 }
  }
  </script>
   
    
    
   
  </body>
</html>
