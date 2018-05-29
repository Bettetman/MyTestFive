<%@page import="cn.sicnu.edu.ming.test05.dao.impl.UserDaoImpl"%>
<%@page import="cn.sicnu.edu.ming.test05.entity.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%!

%>
<%
        request.setCharacterEncoding("utf-8");
		String name =request.getParameter("name");
		String account =request.getParameter("account");
		String password =request.getParameter("password");
		String email =request.getParameter("email");
		String personaldes =request.getParameter("personaldes");
		
		
		
		if(name!=null ||account!=null ||password!=null ||email!=null ||personaldes!=null)
		{
           UserDaoImpl  userDaoImpl =new UserDaoImpl();
           
			User oneUser =new User(account,password,name,email,personaldes);
			
		
		    if(userDaoImpl.findUserByAccount(account)==null){
		
		   
		    	if(userDaoImpl.insertAUser(oneUser)){		
                   request.getRequestDispatcher("signSuccess.html").forward(request,response);
		    	}else{
		    		 request.setAttribute("error", "写入数据库得时候失败");
		    		out.print("写入数据库得时候失败");
		    	}
		    }
		    else{
		     	request.setAttribute("error", "你的账号已经被注册了");  	
		     	out.print( "你的账号已经被注册了");
		    }
			
		}
		else{
			//这儿注册信息有问题和返回注册界面
			 String errorInformation = "你输入的信息可能有问题";
			out.print(errorInformation);
			 application.setAttribute("error", errorInformation);
			 response.sendRedirect("sign.html");
		}







%>
</body>
</html>