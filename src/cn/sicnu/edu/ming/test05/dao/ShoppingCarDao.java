package cn.sicnu.edu.ming.test05.dao;
/**
*@author:  Ming
*@version :2018年5月26日下午8:26:34
*/

import java.util.List;

import cn.sicnu.edu.ming.test05.entity.ShoppingCar;

public interface ShoppingCarDao {
	public List<ShoppingCar>  getAllShoppingByUserId();
	
	public boolean insertAShoppingCar(ShoppingCar shoppingCar);
	
	public boolean findAShoppingCar(int userid,int productid);
	
	public boolean addALoginShoppingCarLoginNumber(ShoppingCar shoppingCar);

}
