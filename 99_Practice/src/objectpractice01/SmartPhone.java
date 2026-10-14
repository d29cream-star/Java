package objectpractice01;

public class SmartPhone {

	public String manufacturer;
	public String color;
	public String model;
	public String networkProvider;
	public String phoneNumber;

	public void call() {
		System.out.println("전화하다.");
	}
	public void powerOn() {
		System.out.println("전원을 켜다.");
	}
	public void charge() {
		System.out.println("충전하다.");
	}
}
