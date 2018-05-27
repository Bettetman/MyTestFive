package cn.sicnu.edu.ming.test05.biz.impl;

import cn.sicnu.edu.ming.test05.biz.ShoppingBiz;
import cn.sicnu.edu.ming.test05.dao.impl.ProductDaoImpl;
import cn.sicnu.edu.ming.test05.dao.impl.ShoppingCarDaoImpl;
import cn.sicnu.edu.ming.test05.entity.ShoppingCar;

/**
*@author:  Ming
*@version :2018年5月26日下午10:56:43
*/
public class ShoppingBizImpl implements ShoppingBiz {
	
	private ProductDaoImpl productDaoImplHelper =null;
	private ShoppingCarDaoImpl shoppingCarHelper=null;


	public ShoppingBizImpl() {

		productDaoImplHelper =new ProductDaoImpl();
		shoppingCarHelper =new ShoppingCarDaoImpl();
	}

	@Override
	public boolean addInShoppingCar(ShoppingCar shoppingCar) {
       return   shoppingCarHelper.addALoginShoppingCarLoginNumber(shoppingCar);


	}

	@Override
	public boolean payForShopping() {

		return false;
	}

	@Override
	public boolean clearTheShoppingCar(int userId) {
		return shoppingCarHelper.deleteShoppingCar(userId);
		
	}

	@Override
	public boolean DeleteAProduct(int userId, int productId) {
		return shoppingCarHelper.deleteShoppingCar(userId, productId);
	}

	@Override
	public boolean changeTheNumberOfGoods(int userId, int productId, int num) {
		if(shoppingCarHelper.findAShoppingCar(userId, productId))
		{
	     if( shoppingCarHelper.updateShoppingCarNumber(userId, productId, num))
	     {
	    	 return true;
	     }
	     return false;
		}
		return false;
	}

}
