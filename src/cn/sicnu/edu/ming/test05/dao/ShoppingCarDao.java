package cn.sicnu.edu.ming.test05.dao;
/**
*@author:  Ming
*@version :2018年5月26日下午8:26:34
*/

import java.util.List;

import cn.sicnu.edu.ming.test05.entity.ShoppingCar;

public interface ShoppingCarDao {
	//find
	public List<ShoppingCar>  getAllShoppingByUserId(int userid);
	//add
	public boolean insertAShoppingCar(ShoppingCar shoppingCar);
	//find
	public boolean findAShoppingCar(int userid,int productid);
	
	public boolean addALoginShoppingCarLoginNumber(ShoppingCar shoppingCar);
	//find
	public ShoppingCar getSqlShoppingCar(int useid,int productid);
	
	//update
	public boolean updateShoppingCarNumber(int userid,int productid,int number);
	
	//delete
	 public boolean deleteShoppingCar(int userid,int productid);

}
