package cn.sicnu.edu.ming.test05.entity;
/**
*@author:  Ming
*@version :2018年5月26日下午7:59:11
*/
public class Product {
	private  int id;
	private String name;
	private int price;
	private String des;

	public Product(int id, String name, int price, String des) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.des = des;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Product() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
