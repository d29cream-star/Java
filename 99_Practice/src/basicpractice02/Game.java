package basicpractice02;

import basicpractice01.Book;
import basicpractice01.Computer;

public class Game {

	public static void main(String[] args) {
		
		System.out.println("롤");
		
		Game g = new Game();
		g.start();
	
		Book b = new Book();
		b.bookMark();
		
		Computer c = new Computer();
		c.powerOn();
		
		
	}
	public void start() {
		System.out.println("게임이 시작되었습니다.");
	}
}
