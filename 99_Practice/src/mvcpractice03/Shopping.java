package mvcpractice03;

public class Shopping {

	private String title;
	private int price;
	private int discount;

	
	public Shopping(String title, int price, int discount) {
		super();
		this.title = title;
		this.price = price;
		this.discount = discount;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Shopping [title=" + title + ", price=" + price + ", discount=" + discount + "]";
	}
	
	
}
