<%@page import="java.util.List"%>
<%@page import="cn.sicnu.edu.ming.test05.dao.impl.ProductDaoImpl"%>
<%@page import="cn.sicnu.edu.ming.test05.entity.Product"%>
<%@page import="cn.sicnu.edu.ming.test05.entity.User"%>
<%@page import="cn.sicnu.edu.ming.test05.dao.impl.UserDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>我的商品展示</title>
<style type="text/css">
	.title{
		width: 100%;
		height: 5%;
		position: relative;
		border: 1px solid red;
	}
	.content{
		width: 1300px;
		left: 1%;
		height: 800px;
		position: relative;
		border: 1px solid red;
	}
	.content ul li{
		width: 350px;
		height: 250px;
		/*background: red;*/
		border: 5px solid black;
		position: relative;
		float: left;
		margin-left: 40px;
		margin-top: 100px;
	}

	.footer{
		width: 100%;
		height: 5%;
		background: green;
		position: relative;
	}
    .shoppingCar{
    	width: 100px;
    	height: 100px;
    	position: fixed;
    	top: 50%;
    	right: 100px;
    	background: red;

    }

    #shoppingImage{
    	width: auto;
    	height: 220px;
    	position: absolute;
    	left: 10px;
    	top: 15px;
    }
    #showInfor{
    	width: 100px;
    	height: 150px;
    	border: 1px solid green;
    	position: absolute;
    	right: 10px;
    	top: 30px;

    }
    #showInfor span{
    	font: 30px;
  

    }


	</style>
</head>
<body>
<div class="title"></div>
	<div class="content">
		<ul>
	<%
		request.setCharacterEncoding("utf-8");

			ProductDaoImpl productDaoImpl =new ProductDaoImpl();
			List <Product> xiaoxu=productDaoImpl.getAllProduct();
			for(Product pro:xiaoxu)
			{
		       out.print("<li>");
		       out.print("<img id=");
		       out.print("'"+"shoppingImage"+"'src=");
		       out.print("'"+"image/"+pro.getDes()+"'>");
		       
		       out.print("<div id='showInfor'>");
		      out.print("<span>Price:</span><small>￥</small><big>222</big>");
		      out.print("<br>");
		      out.print("<small>￥</small><big>"+pro.getPrice()+"</big>");
		      out.print("<br>");
		      
		      out.print("<button>我要购买</button>");
		      out.print("<br>");
		      out.print("<button>加入购物车</button>");
              out.print("</div>");
              out.print("</li>");       

			}
	
	
	
	
	
	%>

		</ul>
	</div>
	<div class="footer"></div>
	<div class="shoppingCar">
		<img id="shopping" src="image/shoppingcar.png">
	</div>
<script src="jsneed/jquery-1.12.4.min.js"></script>
<script src="jsneed/jquery-ui-1.12.1.min.js"></script>

<script type="text/javascript" src="jsneed/jquery.validate.js"></script>
<script type="text/javascript" src="jsneed/jquery.validate.messages_cn.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#shopping").click(function(){
                    window.location.href="login.html"; 
			});


		});



	</script>
	

</body>
</html>