package com.kh.chap01.abstraction.model.vo;

public class Dog {
	//필드부
	public String name;
	public String species;
	public int age;
	public String gender;
	public boolean neutering;
	
	//생성자부
	public Dog() {
		
	}
	public Dog(String name, String species, int age, String gender, boolean neutering) {
		this.name = name;
		this.species = species;
		this.age = age;
		this.gender = gender;
		this.neutering = neutering;
		
	}
	//메소드부
	public void walk() {
		System.out.println("걸어요.");	
	
		System.out.println(name + "가 걸어요");}
	
	
	public void swingTail() {
		
		System.out.println(name+ "가 꼬리를 흔듭니다.");
		age++ ;
		
	}
	
}
