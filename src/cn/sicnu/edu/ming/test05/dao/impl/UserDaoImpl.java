package cn.sicnu.edu.ming.test05.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import cn.sicnu.edu.ming.test05.dao.BaseDao;
import cn.sicnu.edu.ming.test05.dao.RSProcessor;
import cn.sicnu.edu.ming.test05.dao.UserDao;
import cn.sicnu.edu.ming.test05.entity.User;

/**
*@author:  Ming
*@version :2018年5月26日下午8:38:27
*/
public class UserDaoImpl extends BaseDao implements UserDao {



	@Override
	public int countUserNumber() {
		String sql = "select count(*) as userNumber from user";
		RSProcessor pro = new RSProcessor() {
			
			@Override
			public Object process(ResultSet rs) throws SQLException {
				int count =0 ;
				while(rs.next())
				{
					count = rs.getInt("userNumber");
				}
				return count;
			}
		};
       Object obj = this.executeQuery(pro, sql);
		return  (int) obj;
	}

	@Override
	public User findUserByAccount(String account) {
		String sql ="select * from user where account=?";
		RSProcessor processor =new RSProcessor() {
			
			@Override
			public Object process(ResultSet rs) throws SQLException {
               User user = null;
               while (rs.next()) { 
            		int id = rs.getInt("id");
            		String account = rs.getString("account");
            		String password = rs.getString("password");
            		String showName = rs.getString("showname");
            		String email = rs.getString("email");
            		String describe = rs.getString("describe")!=null?rs.getString("describe"):"null";
            		
            		user=new User(id, account, password, showName, email,describe);
            
				
			}
				return user;
			}
		};
		Object obj = this.executeQuery(processor, sql, account);
		
		return (User)obj;
	}



	@Override
	public boolean insertAUser(User user) {
		if(this.findUserByUser(user)!=null)
		{
			return false;
		}
		else {
			String sql ="insert into user (`account`, `password`, `showname`, `email`, `describe`) "
		                                           +"values(?,?,?,?,?)";
			String account = user.getAccount();
			String password =user.getPassword();
			String showName =user.getShowName();
			String email =user.getEmail();
			String describe =user.getDescribe();
			Object[] params = {account,password,showName,email,describe};
			int count = this.executeUpdate(sql, params);
			
			return count>0?true:false;
		}
	}

	@Override
	public boolean deleteAUser(User user) {
	   if(findUserByUser(user)==null)
	   {
		   return false;
	   }
	   else {
		   String sql = "delete  from  user where account = ?";
		   Object[] params={user.getAccount()};
		   int count =this.executeUpdate(sql, params);
		   return count>0?false:true;
		
	}
	
	}

	@Override
	public User findUserByUser(User user) {
		return this.findUserByAccount(user.getAccount());
	}

}
