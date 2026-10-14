package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Dog;

public class Run {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.walk();
		dog.name = "나폴레옹";
		System.out.println(dog.name);
		
		Dog khan = new Dog();
		khan.name = "징기스칸";
		System.out.println(khan.name);
	
		dog.walk();
		khan.walk();
	
		dog.age = 6;
		System.out.println(dog.age);
		
		dog.swingTail();
		System.out.println(dog.age);
		
	}

}
