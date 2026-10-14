package basicpractice01;

public class Computer {

	public static void main(String[] args) {
		
	System.out.println("패키지가 기준이 아니라 클래스 기준으로 main이 있으면 될듯");

	Computer c = new Computer();
	c.powerOn();
	}
	public void powerOn() {

		System.out.println("위에 줄은 선언?!?!? 메소드 선언인가");
	}
}
