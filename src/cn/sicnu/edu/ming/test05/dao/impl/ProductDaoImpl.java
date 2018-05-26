package cn.sicnu.edu.ming.test05.dao.impl;

import java.util.List;

import cn.sicnu.edu.ming.test05.dao.BaseDao;
import cn.sicnu.edu.ming.test05.dao.ProductDao;
import cn.sicnu.edu.ming.test05.entity.Product;

/**
*@author:  Ming
*@version :2018年5月26日下午8:39:51
*/
public class ProductDaoImpl extends BaseDao implements ProductDao {



	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean DelectAProductById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DelectAProductByObj(Product pro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertAProduct(Product pro) {
		// TODO Auto-generated method stub
		return false;
	}

}
