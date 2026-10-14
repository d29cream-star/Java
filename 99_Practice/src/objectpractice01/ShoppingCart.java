package objectpractice01;

public class ShoppingCart {

	public String marketName;
	public String type;
	public boolean babySeat;
	public boolean charge;


	public void addItem() {
		System.out.println("상품을 추가하다.");
	}
	public void removeItem() {
		System.out.println("상품을 제거하다");
	}
	public void checkOut() {
		System.out.println("결제하다.");
	}
}
