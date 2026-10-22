package com.kh.chap03.model.vo;

public class Shop {

	private final String name;
	private final String menu;
	private final int price;

	public Shop(String name, String menu, int price) {
		this.name = name;
		this.menu = menu;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public String getMenu() {
		return menu;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Shop [name=" + name + ", menu=" + menu + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// System.out.println(obj);
		Shop shop = (Shop) obj;
		if (this.price == shop.price && this.name.equals(shop.name) && this.menu.equals(shop.menu)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {

		return (name + menu + price).hashCode();
	}

}
