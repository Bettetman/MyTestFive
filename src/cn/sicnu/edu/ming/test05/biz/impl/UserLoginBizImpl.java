package cn.sicnu.edu.ming.test05.biz.impl;

import cn.sicnu.edu.ming.test05.biz.UserLoginBiz;
import cn.sicnu.edu.ming.test05.dao.impl.UserDaoImpl;
import cn.sicnu.edu.ming.test05.entity.User;

/**
*@author:  Ming
*@version :2018年5月26日下午11:43:30
*/
public class UserLoginBizImpl implements UserLoginBiz {
     UserDaoImpl  userDaoHelper =null;
	public UserLoginBizImpl() {
		userDaoHelper =new UserDaoImpl();
	}

	@Override
	public User login(String account, String password) {
		User us = userDaoHelper.findUserByAccount(account) ;
	    if(us==null && us.getPassword().equals(password))
	    {
	    	return us;
	    	
	    }		
		return null;
	}

}
