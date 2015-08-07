<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My vitae</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	div{
	border:medium  solid  pink;
	color:#FF00FF;
	width:380px;
	height:150px;
	margin-left:800px;
	margin-top:360px;
	background-image:url(image/13RW4563403F-421241.jpg);
	line-height:80px;
	text-align:center;
	}
	a:link {text-decoration:none;} 
	a:visited {text-decoration:none;} 
	a:hover {text-decoration:none;}
    a:active {text-decoration:none;}
	</style>
  </head>
  
 <body background="image/20130209125000177.jpg">
 <!--
 <script language="javascript" type="text/javascript">
    function close(){
	          alert("亲，请单击右上角红色按钮处关闭窗口哦！");
     }
  </script>
  -->
    <div align="center">
         <strong><font size="5"> 亲，你确定要查看这份简历吗？</font></strong><br/>
      <a href="http://localhost:8080/MyVitae"><input type="button" value="确定" > </a>   
      <input type="button" value="取消" onclick="window.close()" >
  </div>
  </body>
</html>
