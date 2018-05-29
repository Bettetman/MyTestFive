<%@page import="cn.sicnu.edu.ming.test05.entity.User"%>
<%@page import="cn.sicnu.edu.ming.test05.dao.impl.UserDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
            out.print("start:");
UserDaoImpl userDaoImpl =new UserDaoImpl();
out.print(userDaoImpl.findUserByAccount("123456"));
out.print("<br>");
out.print(userDaoImpl.findUserByAccount("2147483647"));
User user =new User("123456789","123456","xiaxu","11451287@qq.com","dad");
out.print("<br>");

out.print(userDaoImpl.countUserNumber());
out.print("<br>");

out.print(userDaoImpl.insertAUser(user));



%>

</body>
</html>