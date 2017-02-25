<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>编辑</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="dist/css/blog.css" rel="stylesheet">
    <script src="dist/js/jquery-3.1.0.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
    <!-- jsp的js引入目录默认在webroot下 -->
    <script src="dist/js/ckeditor.js"></script>
    
  </head>
  
  <body>
    <div class="blog-masthead">
      <div class="container">
        <nav class="blog-nav">
          <a class="blog-nav-item" href="Home.jsp">Home</a>
          <a class="blog-nav-item" href="Catlog.jsp">Articles</a>
          <a class="blog-nav-item" href="PhotoPage.jsp">Photo</a>
          <a class="blog-nav-item" href="About.jsp">About</a>
          <a class="blog-nav-item active" href="javascript:void(0)">Login</a>
        </nav>
      </div>
    </div>

    <div class="container">
		<form action="addarticle.action" method="post">
			<div class="lead blog-description">title:<input id="title" name="title" type="text"></div>
			<textarea id="content" name="content" rows="10" cols="80"></textarea>
			<input type="submit" class="btn btn-lg btn-primary">
		</form>
		<hr>
		<form action="fileupload.action" method="post" enctype="multipart/form-data">
			<h5>请选择要上传的图片</h5>
			<!-- 通过name来注入 -->
			<input type="file" name="upload">
			<input type="submit" class="btn btn-lg btn-primary">
		</form>
    </div><!-- /.container -->

    <footer class="blog-footer">
      <p>Blog template built for <a href="http://getbootstrap.com">Bootstrap</a> by <a href="https://twitter.com/mdo">@mdo</a>.</p>
      <p>
        <a href="#">Back to top</a>
      </p>
    </footer>
  </body>
  <script type="text/javascript">
  	CKEDITOR.replace('content');
  </script>
</html>
