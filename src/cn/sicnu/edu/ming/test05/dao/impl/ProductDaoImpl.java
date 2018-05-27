package cn.sicnu.edu.ming.test05.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.sicnu.edu.ming.test05.dao.BaseDao;
import cn.sicnu.edu.ming.test05.dao.ProductDao;
import cn.sicnu.edu.ming.test05.dao.RSProcessor;
import cn.sicnu.edu.ming.test05.entity.Product;

/**
*@author:  Ming
*@version :2018年5月26日下午8:39:51
*/
public class ProductDaoImpl extends BaseDao implements ProductDao {



	@Override
	public List<Product> getAllProduct() {
		String sql ="select * from product ";
		RSProcessor processor =new RSProcessor() {
			
			@Override
			public Object process(ResultSet rs) throws SQLException {
				List<Product> productList= null;
				productList =new ArrayList<Product>();
				while(rs.next())
				{
					int id =rs.getInt("id");
					int price =rs.getInt("price");
					String name =rs.getString("name");
					String des = rs.getString("des");
					Product product =new Product(id, name, price, des);
					productList.add(product);
				}
				
				return productList;
			}
		};
		Object object = this.executeQuery(processor, sql);
		return  (List<Product>)object;
	}

	@Override
	public boolean DelectAProductById(int id) {
		String sql ="DELETE FROM productWHERE  `id`=?";
		int count = this.executeUpdate(sql, id);
		return count>0?true:false;
	}

	@Override
	public boolean DelectAProductByObj(Product pro) {
			return this.DelectAProductById(pro.getId());
	}

	@Override
	public boolean insertAProduct(Product pro) {
		String sql ="INSERT INTO product (`id`, `name`, `price`, `des`) VALUES (?,?,?,?)";
        Object[] params ={pro.getId(),pro.getName(),pro.getPrice(),pro.getDes()};
        int count =this.executeUpdate(sql, params);
		return count>0?true:false;
	}

}
