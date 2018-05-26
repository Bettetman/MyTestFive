package cn.sicnu.edu.ming.test05.dao;

import java.util.Vector;
import cn.sicnu.edu.ming.test05.entity.*;

/**
*@author:  Ming
*@version :2018年5月26日下午8:25:56
*/
public interface UserDao {
	
	//查找用户
	public int countUserNumber();
	
	public User findUserByAccount(int account);
	public User findUserByUser(User user);
	
	//添加用户
	public boolean  insertAUser(User user);
	
	public boolean deleteAUser(User user);

}
