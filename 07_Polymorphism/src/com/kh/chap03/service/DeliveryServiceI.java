package com.kh.chap03.service;

public interface DeliveryServiceI {

	public abstract void delivery(); 
	
	//public static final int num = 1;
	
	default void close() {
		System.out.println("닫힙니다.");
		
		
		
	}
	
}
