package cn.sicnu.edu.ming.test05.entity;
/**
*@author:  Ming
*@version :2018年5月26日下午8:00:31
*/
public class ShoppingCar {
	private  int userId;
	private int productId;
	private int price;
	private int number;

	public ShoppingCar(int userId, int productId, int price, int number) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.price = price;
		this.number = number;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public ShoppingCar() {
		// TODO Auto-generated constructor stub
	}

}
