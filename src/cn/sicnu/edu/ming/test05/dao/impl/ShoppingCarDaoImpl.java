package cn.sicnu.edu.ming.test05.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.sicnu.edu.ming.test05.dao.BaseDao;
import cn.sicnu.edu.ming.test05.dao.RSProcessor;
import cn.sicnu.edu.ming.test05.dao.ShoppingCarDao;
import cn.sicnu.edu.ming.test05.entity.ShoppingCar;

/**
*@author:  Ming
*@version :2018年5月26日下午8:40:23
*/
public class ShoppingCarDaoImpl extends BaseDao implements ShoppingCarDao {

	public ShoppingCarDaoImpl() {
     
	}

	@Override
	public List<ShoppingCar> getAllShoppingByUserId(int userid) {
	    String sql ="select * from shoppingcar where userid =?";
	    Object[] params={userid};
	    RSProcessor processor = new RSProcessor() {
			
			@Override
			public Object process(ResultSet rs) throws SQLException {
				List<ShoppingCar> shoppingList = new ArrayList<ShoppingCar>();
		      while(rs.next())
		      {
		    	  int productid = rs.getInt("productid");
		    	  int price =rs.getInt("price");
		    	  int num = rs.getInt("num");
		    	  ShoppingCar shoppingCar =new ShoppingCar(userid, productid, price, num);
		    	  shoppingList.add(shoppingCar);
		    	  
		      }
				return  shoppingList;
			}
		};
	    Object object =this.executeQuery(processor, sql, params);
		return (List<ShoppingCar>)object;
	}

	@Override
	public boolean insertAShoppingCar(ShoppingCar shoppingCar) {
		String sql ="insert into shoppingcar (`userid`,`productid`,`price`,`num`) values(?,?,?,?)";
		Object[] params={shoppingCar.getUserId(),shoppingCar.getProductId(),shoppingCar.getPrice(),shoppingCar.getNumber()};
		int  count = this.executeUpdate(sql, params);
		return count>0?true:false;
	}

	@Override
	public boolean findAShoppingCar(int userid, int productid) {
		String sql="select count(*) as counts from shoppingcar where userid=? and productid=?";
		Object [] params={userid,productid};
		RSProcessor processor =new RSProcessor() {
			
			@Override
			public Object process(ResultSet rs) throws SQLException {
			   int count=0;
			   if(rs.next())
			   {
                    count = rs.getInt("counts");
			   }
				return count;
			}
		};
	   Object object =this.executeQuery(processor, sql,params );
	   return (int)object>0?true:false;
	}

	@Override
	public boolean addALoginShoppingCarLoginNumber(ShoppingCar shoppingCar) {
		if(this.findAShoppingCar(shoppingCar.getUserId(), shoppingCar.getProductId())){
			ShoppingCar getSQLshoppingCar = this.getSqlShoppingCar(shoppingCar.getUserId(), shoppingCar.getProductId());
			int totalNum = getSQLshoppingCar.getNumber()+shoppingCar.getNumber();
			if(this.updateShoppingCarNumber(shoppingCar.getUserId(), shoppingCar.getProductId(), totalNum)){
				return true;
			}
			else {
				return false;
			}
			
			
		}
		else{
			if(this.insertAShoppingCar(shoppingCar))
			{
				return true;
			}
			else{
				return false;
			}
		}
	}

	@Override
	public ShoppingCar getSqlShoppingCar(int useid, int productid) {
	   String sql ="select * from shoppingcar where useid=? and productid=?";
	   Object [] params={useid,productid};
	   RSProcessor processor =new RSProcessor() {
		
		@Override
		public Object process(ResultSet rs) throws SQLException {
			ShoppingCar shoppingCar =null;
			if(rs.next())
			{
				int userid =rs.getInt("userid");
				int productid =rs.getInt("productid");
				int price =rs.getInt("price");
				int number =rs.getInt("num");
				shoppingCar = new ShoppingCar(userid, productid, price, number);
				
			}
			return shoppingCar;
		}
	};
		Object object = this.executeQuery(processor, sql, params);
		return (ShoppingCar)object;
	}
	@Override
	public boolean updateShoppingCarNumber(int userid,int productid,int number)
	{
		String sql ="update shoppingcar set num=? where userid=? and productid=?";
		Object[] params ={number,userid,productid};
		int count = this.executeUpdate(sql, params);
		return count>0?true:false;
	}
	@Override
   public boolean deleteShoppingCar(int userid,int productid)
   {
		String sql ="delete from shoppingcar  where userid=? and productid=?";
		Object [] params ={userid,productid};
		int count =this.executeUpdate(sql, params);
	   return count>0?true:false;
   }
	   public boolean deleteShoppingCar(int userid)
	   {
			String sql ="delete from shoppingcar  where userid=?";
			Object [] params ={userid};
			int count =this.executeUpdate(sql, params);
		   return count>0?true:false;
	   }
}
