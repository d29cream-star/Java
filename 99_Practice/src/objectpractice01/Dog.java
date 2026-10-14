package objectpractice01;

public class Dog {

	public String name;
	public int age;
	public String color;
	public String gender;
	public String species; 
	
	public void walk() {
		System.out.println("걸어요.");
	}

	public void bark() {
		System.out.println("짖어요.");
	}
	public void wagTail() {
		System.out.println("꼬리를 흔들어요.");
	}
	public void eat() {
		System.out.println("먹어요.");
	}
	public void sleep() {
		System.out.println(name + "가 자요.");
	}
}


