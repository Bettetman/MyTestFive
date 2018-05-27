package cn.sicnu.edu.ming.test05.biz;

import cn.sicnu.edu.ming.test05.entity.ShoppingCar;

/**
*@author:  Ming
*@version :2018年5月26日下午10:30:05
*/
public interface ShoppingBiz {
	 public boolean addInShoppingCar(ShoppingCar shoppingCar);
	 
	 public boolean payForShopping();
	 
	 public boolean  clearTheShoppingCar(int userId);
	 
	 public boolean  DeleteAProduct(int userId,int productId);
	 
	 public boolean changeTheNumberOfGoods(int userId,int productId ,int num );

}
