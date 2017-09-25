<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>关于</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="dist/css/bootstrap.min.css" rel="stylesheet">

    <link href="dist/css/blog.css" rel="stylesheet">
    <script src="dist/js/jquery-3.1.0.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>

  </head>
  
  <body>
    <div class="blog-masthead">
      <div class="container">
        <nav class="blog-nav">
          <a class="blog-nav-item" href="Home.jsp">Home</a>
          <a class="blog-nav-item" href="Catlog.jsp">Articles</a>
          <a class="blog-nav-item" href="PhotoPage.jsp">Photo</a>
          <a class="blog-nav-item active" href="javascript:void(0);">About</a>
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
            <p id="content">
            <h3>关于我：</h3>
            <hr>
            一个大菜逼，一只单身狗.<br><br><h3>目标：</h3>
            <hr>1.开始攒10w块钱   0/100000<br>
            	2.看dubbo,brpc源码 2017.9月中开始看dubbo<br>
            	3.学会使用netty<br>
            <br><br>
            <h3>等级证书：</h3><hr>
            计算机二级、英语四级（CET-4）、英语六级（CET-6）
            <br><br><h3>项目经验：</h3>
            <hr>
            1.这个个人博客<br>
            2.一个利用看知乎api搭建的android app<br>
            3.Java爬虫
            <hr>
            <br>
            联系：270417599@qq.com
            </p>
          </div><!-- /.blog-post -->

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
