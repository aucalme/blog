package edu.java.jdbc06;

public class Yamukja {
	private String id;
	private String password;
	private String menu;
	private int count;
	private int price;
	
	
	public Yamukja() {}
	public Yamukja(String id, String password) {
		this.id = id;
		this.password = password;
	}
	public Yamukja(String menu, int count, int price) {
		this.menu = menu;
		this.count = count;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "{ id : " + id + ", password : " + password + "}, { menu: " + menu + ", count: " + count + ", price: " + price+ "}";
	}
	
}
