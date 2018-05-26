package cn.sicnu.edu.ming.test05.dao.impl;

import java.util.List;

import cn.sicnu.edu.ming.test05.dao.BaseDao;
import cn.sicnu.edu.ming.test05.dao.ShoppingCarDao;
import cn.sicnu.edu.ming.test05.entity.ShoppingCar;

/**
*@author:  Ming
*@version :2018年5月26日下午8:40:23
*/
public class ShoppingCarDaoImpl extends BaseDao implements ShoppingCarDao {

	public ShoppingCarDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ShoppingCar> getAllShoppingByUserId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertAShoppingCar(ShoppingCar shoppingCar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean findAShoppingCar(int userid, int productid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addALoginShoppingCarLoginNumber(ShoppingCar shoppingCar) {
		// TODO Auto-generated method stub
		return false;
	}

}
