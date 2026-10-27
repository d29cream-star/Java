package mvcpractice03;

import java.util.List;

public class ShoppingController {

	private ShoppingService ss = new ShoppingService();
	
	public void create(String title, int price, int discount) {
		ss.create(new Shopping(title, price, discount));
	}
	
	
	public List<Shopping> read(){
		return ss.read();
	}
	
	public void remove() {
		ss.remove();
	}
	public void update(String title, int newPrice) {
		ss.update(title, newPrice);
		return;
	}
}
