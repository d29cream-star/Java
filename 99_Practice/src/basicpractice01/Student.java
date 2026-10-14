package basicpractice01;

import basicpractice02.Bank;
import basicpractice02.Car;

public class Student {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
		Car c = new Car();
		c.drive();
		
		Book b = new Book();
		b.open();
		b.close();
		b.bookMark();
		b.turnPage();
		b.read();
		
		Bank bk = new Bank();
		bk.deposit();
		bk.withdraw();
		
		System.out.println("강아지");
		
		
		
	}
}

