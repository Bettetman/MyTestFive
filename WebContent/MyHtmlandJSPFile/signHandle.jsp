<%@page import="cn.sicnu.edu.ming.sql.SQLHelper"%>
<%@page import="cn.sicnu.edu.ming.entity.UserInformation"%>
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
			UserInformation onePerson = new UserInformation(name,account,password,email,personaldes);
		    SQLHelper helpSql= new SQLHelper();
		    if(helpSql.isExistAccount(account)){
		    	 response.sendRedirect("sign.html");
		    }
		    else{
		    	
		    	if(helpSql.addOneAccount(onePerson)){		    	
		    	request.getRequestDispatcher("signSuccess.html") .forward(request,response);
		    	}else{
		    		 response.sendRedirect("sign.html");
		    		
		    	}
		    }
			
		}
		else{
			//这儿注册信息有问题和返回注册界面
			 String errorInformation = "你输入的信息可能有问题";
			 application.setAttribute("error", errorInformation);
			 response.sendRedirect("sign.html");
		}







%>
</body>
</html>