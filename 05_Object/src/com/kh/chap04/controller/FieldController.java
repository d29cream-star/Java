package com.kh.chap04.controller;

public class FieldController {

	public int global;
	
	public static String str = "나는 스테택";
	
	
	public FieldController() {
		
	}
	public FieldController(int global) {
		this.global = global;
	}
	
	public void checkVariable(int parameter) {
		
		int local = 1;
		
		System.out.println(global);
		System.out.println(local);
		System.out.println(parameter);
	}
}
