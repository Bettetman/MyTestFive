package cn.sicnu.edu.ming.test05.dao;
/**
*@author:  Ming
*@version :2018年5月26日下午8:26:11
*/

import java.util.List;

import cn.sicnu.edu.ming.test05.entity.Product;

public interface ProductDao {
	public List<Product> getAllProduct();
	
	
	public boolean DelectAProductById(int id);
	public boolean DelectAProductByObj(Product pro);
	
	public boolean insertAProduct(Product pro);
	
	

}
