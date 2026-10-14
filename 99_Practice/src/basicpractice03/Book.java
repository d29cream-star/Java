package basicpractice03;

import basicpractice04.Man;

public class Book {

	public static void main(String[] args) {
		Book b = new Book();
		b.read();
		
		Car c = new Car();
		c.drive();
		
		Man m = new Man();
		m.seat();
		
		
	}
	public void read() {
		System.out.println("책을 읽습니다.");
	}
	public void open() {
		System.out.println("책을 폅니다.");
	}
	public void buy() {
		System.out.println("책을 삽니다.");
	}
	public void sell() {
		System.out.println("책을 팝니다.");
	}
	public void bookMark() {
		System.out.println("책갈피를 합니다.");
	}
}
