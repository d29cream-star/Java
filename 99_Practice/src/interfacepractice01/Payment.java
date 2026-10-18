package interfacepractice01;

public class Payment implements Card, Cash, Point {

	private int pay;

	public Payment() {
		super();
	}

	public Payment(int pay) {
		super();
		this.pay = pay;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
}
