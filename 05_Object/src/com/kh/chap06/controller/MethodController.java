package com.kh.chap06.controller;

public class MethodController {
	
	public int add(int a, int b) {
		return a + b;
	}

	public int fn(int num) {
		return num * 2;
	}

	private String returnStr() {
		return "반환값";
	}
	
	public String fn2() {
		return returnStr();
	}
	
	public MethodController() {
		
	}
	
	public void method() {
		System.out.println("메소드 오버로딩1");
	}
	public void method(int a) {
		System.out.println("메소드 오버로딩2");
	}
	public void method(int a, int b) {
		System.out.println("메소드 오버로딩3");
	}
	public void method(String s) {
		System.out.println("메소드 오버로딩4");
	}
	public void method(int a, String s) {
		
	}
	public void method(String s, int a ) {
		
	}
	
	
}
