<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link rel="stylesheet" href="css/freestyle.css" />
		<link rel="stylesheet" href="css/bootstrap.css" />
		<script type="text/javascript" src="js/bootstrap.js" ></script>
		<script type="text/javascript" src="js/jquery-3.3.1.js" ></script>
		<style>
			body{
				background-image: url(img/登陆注册背景.jpg);
				background-size: cover;
				margin: 0px;
				padding: 0px;
			}
			#header2{
				width:100%;
				margin: 0px;
				padding: 0px;
				float:left;
			}
			#nav1{
				margin: 0px;
				height:35px;
				width:100%;
				background-image:url(img/登陆注册背景.jpg);
				background-size: cover;
				filter: blur(1px);
			}
			#section1{
				height:35px;
				width:100%;
				background-color: rgba(255,255,255,0.5);
				box-shadow: 0 0 0 0px,0 0.5em 1em rgba(0, 0, 0, 0.6);
				position:absolute;
				top:0px;
				left:0px;	
				margin:0px;
			}
			.div1{
				margin: auto;
  				position: absolute;
    			left: 0;right: 0;
				width:900px ;
				height: 150px;
			}
			#ul1{
				list-style-type: none;
				position:relative;
				top:0px;
				left:0px;	
				margin:0px;
				padding: 0;
			}
			#article1
			{
				position: relative;
				top:170px;
				background-color: rgba(255,255,255,0.6);
				height: 500px;
				width: 900px;
				margin:auto;
			}
			#login{
				position:absolute;
				top:0px;
				right:0px;
			}
			#hearder2{
				width: 900px;
				height: 80px;
				float:left;
				display: flex; 
				justify-content:center; 
				align-items:Center;
			}
			#section2{
				width:450px;
				height: 300px;
				border-right-width:2px;
				border-right-style: solid;
				border-right-color: Pink;
				float:left;
			}
			#aside1{
				width: 440px;
				height:300px;
				float:left;
			}
			#span1{
				font-size:30px;
				font-family:  "宋体";
				color: gray;
			}
			.hr1 {/*透明渐变水平线*/
				width:380px;
				margin:0 auto;
				margin-bottom: 2px;
				border: 0;
				height: 2px;
                background-image: linear-gradient(to left, rgba(0, 0, 0, 0), rgba(255, 255, 255, 1));
                background-color: pink;
			}
			.hr2{
				width:380px;
				margin:0 auto;
				margin-bottom: 2px;
				border: 0;
				height: 2px;
                background-image: linear-gradient(to right, rgba(0, 0, 0, 0), rgba(255, 255, 255, 1));
                background-color: pink;
			}
			.hr3{
				width:800px;
				margin:0 auto;
				border: 0;
				height: 2px;
                background-image: linear-gradient(to left, rgba(255, 255, 255, 1),rgba(0, 0, 0, 0), rgba(255, 255, 255, 1));
                background-color: pink;
                margin-top: 65px;
			}
			#table1{
				width:350px;
				margin-left: 50px;
			}
			.input1{
				height:35px;
				width: 350px;
				border-radius: 3px 3px 3px 3px;
				border-style:solid;
				border-width: 1px;
				border-color: gainsboro;
				padding-left: 10px;
				background-color: rgba(255,255,255,0.7);
			}
			#footer1{
				float: left;
				width: 900px;
				text-align: center;
				color: darkgray;
			}
		</style>
		<script>
		function login()
		{
			 document.getElementById('myform').action="login"
		     document.getElementById('myform').submit();
		}
		function gotoregister()
		{
			 document.getElementById('myform').action="gotoregister"
			 document.getElementById('myform').submit();
		}
		</script>
</head>
<body>
<header id="header2">
			<nav id="nav1"></nav>
			<section id="section1"></section>
		</header>
		<div class="div1">
			<ul id="ul1" class="list-inline">
					<ui><button type="button"  class="bton bton-header"onclick="location='index.html'">发现音乐</button></ui><ui><button type="button"  class="bton bton-header"onclick="location='sousuo.html'">搜索音乐</button></ui><ui><button type="button"  class="bton bton-header" onclick="location='gerenzhuye.html'">个人中心</button></ui>
			</ul>
			<button type="button" id="login" class="bton bton-pink" onclick="location='denglu.html'">登录</button>
			<article id="article1">
				<hearder id="hearder2">
					<hr class="hr1">
					<span id="span1">登录</span>
					<hr class="hr2">
				</hearder>
				<section id=section2>
					<img src="img/LOGO2.png" style="width: 220px;margin: 0 auto; display: table-cell;">
				</section>
				<aside id="aside1">
					<form  id="myform" method="post">
					<table id="table1">
						<tr>
							<td></br></td>
						</tr>
						<tr>
							<td><input type="text"  name="user_id" id="user_id" class="input1" placeholder="账号" />
							<span ><%=request.getAttribute("message")==null?"":request.getAttribute("message") %></span></td>
						</tr>
						<tr>
							<td></br></td>
					</tr>
						<tr>
							<td><input type="password" name="user_password" id="user_password"  class="input1" placeholder="密码"></td>
						</tr>
						<tr>
							<td></br></td>
						</tr>
						<tr>
							<td></br></td>
						</tr>
						<tr>
							<td></br></td>
					</tr>
						<tr>
							<td><input type="button" value="登录" name="btnSubmit" class="bton bton-login" onclick="login()"/>
							<input type="button" value="注册" name="btnButton" class="bton bton-reg"onclick="gotoregister()"/></td>
						</tr>
					</table>
					</form>
				</aside>
				<footer id="footer1">
					<hr class="hr3"/>
					<br />
					<span>蚁人公司版权所有©1997-2018&emsp;天津蚁人科技有限公司运营：津网文[2018]3506-263号</span>
				</footer>
			</article>
</body>
</html>