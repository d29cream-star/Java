package basicpractice02;

import basicpractice01.Cafe;

public class Phone {

	public static void main(String[] args) {
		
		Cafe c = new Cafe();
		c.open();
		c.makeCoffee();
		c.clean();
		c.close();
		
		Phone p = new Phone();
		p.call();
				
	}
	public void call() {
		System.out.println("전화가왔어요");
	}
	
}
