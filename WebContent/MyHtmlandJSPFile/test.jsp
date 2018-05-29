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
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
            out.print("start:");
ProductDaoImpl productDaoImpl =new ProductDaoImpl();
List <Product> xiaoxu=productDaoImpl.getAllProduct();
for(Product pro:xiaoxu)
{
	out.print(pro.getName()+"<br>"+pro.getDes());
	
}



%>

</body>
</html>