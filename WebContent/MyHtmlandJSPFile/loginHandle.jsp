<%@page import="cn.sicnu.edu.ming.test05.entity.User"%>
<%@page import="cn.sicnu.edu.ming.test05.dao.impl.UserDaoImpl"%>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>loginhandle</title>
</head>
<body>
<%
     request.setCharacterEncoding("utf-8");
      String account = request.getParameter("account");
      String password =request.getParameter("password");

      
      if(account!=null || password!=null){
      
    	UserDaoImpl helper =new  UserDaoImpl();
    	
    
  
      User user=helper.findUserByAccount(account);
      if(user!=null)
      {
    	  	  out.print("账户存在");
    		  if(user.getPassword().equals(password))
    		  {
    			 
    				request.getRequestDispatcher("loginSuccess.jsp") .forward(request,response);
    		  }
    		  else{
    				 response.sendRedirect("login.html");
    		  }
      }else{
    	  
    		 response.sendRedirect("login.html");
      }
      
      }
      else{
    	  
    	response.sendRedirect("login.html");
      }


%>

</body>
</html>