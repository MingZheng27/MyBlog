<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>文章目录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link href="dist/css/bootstrap.min.css" rel="stylesheet">

    <link href="dist/css/blog.css" rel="stylesheet">
    <script src="dist/js/jquery-3.1.0.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
    <script src="dist/js/catlog.js?ver=1.1"></script>
	
  </head>
  
  <body>
    <div class="blog-masthead">
      <div class="container">
        <nav class="blog-nav">
          <a class="blog-nav-item" href="Home.jsp">Home</a>
          <a class="blog-nav-item active" href="javascript:void(0)">Articles</a>
          <a class="blog-nav-item" href="PhotoPage.jsp">Photo</a>
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

      <div class="row">

        <div class="col-sm-8 blog-main">

          <div class="blog-post">
            <p id="content"></p>
          </div><!-- /.blog-post -->
			<nav>
            	<ul class="pager">
              		<li><a id="previous">Previous</a></li>
              		<li><a id="next">Next</a></li>
            	</ul>
         	</nav>
        </div><!-- /.blog-main -->

        <div class="col-sm-3 col-sm-offset-1 blog-sidebar">
          <div class="sidebar-module sidebar-module-inset">
            <h4>About</h4>
            <p>武汉理工大学学生党/喜欢写java/会点android/weibo:关耳金名</p>
          </div>
          <div class="sidebar-module">
            <h4>Elsewhere</h4>
            <ol class="list-unstyled">
              <li><a href="https://github.com/MingZheng27">GitHub</a></li>
              <li><a href="http://weibo.com/270417599">Weibo</a></li>
            </ol>
          </div>
        </div><!-- /.blog-sidebar -->

      </div><!-- /.row -->

    </div><!-- /.container -->

    <footer class="blog-footer">
      <p>Blog template built for <a href="http://getbootstrap.com">Bootstrap</a> by <a href="https://twitter.com/mdo">Ming Zheng</a>.</p>
      <p>
        <a href="javascript:scroll(0,0)">Back to top</a>
      </p>
    </footer>
  </body>
</html>
