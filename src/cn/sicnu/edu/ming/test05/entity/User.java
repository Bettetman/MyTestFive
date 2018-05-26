package cn.sicnu.edu.ming.test05.entity;
/**
*@author:  Ming
*@version :2018年5月26日下午7:53:17
*/
public class User {
	private int id;
	private int account;
	private String password;
	private String showName;
	private String email;
	private String describe;
 

	public User(int id, int account, String password, String showName, String email, String describe) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.showName = showName;
		this.email = email;
		this.describe = describe;
	}

	public User(int id, int account, String password, String showName, String email) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.showName = showName;
		this.email = email;
	}

	public User(int account, String password, String showName, String email) {
		super();
		this.account = account;
		this.password = password;
		this.showName = showName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

}
