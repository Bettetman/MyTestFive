	
<%@page import="cn.sicnu.edu.ming.test05.dao.impl.UserDaoImpl"%>
<%@ taglib      uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"      %>
<%@ taglib      uri="http://java.sun.com/jsp/jstl/core" prefix="c"      %>
 
<sql:query var="rs"      dataSource="jdbc/JDBCpool">
select * from user
</sql:query>
 
<html>
       <head>
         <title>DB Test</title>
       </head>
       <body>
 
       <h2>Results</h2>
       <% 
     
	   	UserDaoImpl helper =new  UserDaoImpl();
	   	int j = helper.countUserNumber();
	   out.print(j);
       out.print(helper.findUserByAccount(12345678).getEmail());
       
       %>
      
 
       </body>
       
</html>       
       