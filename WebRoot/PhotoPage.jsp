<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>照片</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="dist/css/blog.css" rel="stylesheet">
    <link href="dist/css/lightbox.css" rel="stylesheet">
    <link href="dist/css/mycss.css" rel="stylesheet">
    <script src="dist/js/jquery-3.1.0.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
	<script src="dist/js/photos.js?ver=1.0"></script>
  </head>
  
  <body>
    <div class="blog-masthead">
      <div class="container">
        <nav class="blog-nav">
          <a class="blog-nav-item" href="Home.jsp">Home</a>
          <a class="blog-nav-item" href="Catlog.jsp">Articles</a>
          <a class="blog-nav-item active" href="javascript:void(0)">Photo</a>
          <a class="blog-nav-item" href="About.jsp">About</a>
          <a class="blog-nav-item" href="Manager/Editor.jsp">Login</a>
        </nav>
      </div>
    </div>

    <div class="container">

      <div class="blog-header">
        <h1 class="blog-title">关耳金名的Blog</h1>
        <p class="lead blog-description">会偶尔更新一些自己学习的知识和经验<br/>
        GitHub:https://github.com/MingZheng27
        </p>
      </div>

      <div id="row">
		
      </div><!-- /.row -->
      		<nav>
            	<ul class="pager">
              		<li><a id="previous">Previous</a></li>
              		<li><a id="next">Next</a></li>
            	</ul>
         	</nav>

    </div><!-- /.container -->

    <footer class="blog-footer">
      <p>Blog template built for <a href="http://getbootstrap.com">Bootstrap</a> by <a href="https://twitter.com/mdo">Ming Zheng</a>.</p>
      <p>
        <a href="javascript:scroll(0,0)">Back to top</a>
        <!-- 第一个参数水平位置，第二个参数竖直位置 -->
      </p>
    </footer>
    <script src="dist/js/lightbox.js"></script>
    <!-- lightbox.js一定要放最下面 -->
  </body>
</html>
