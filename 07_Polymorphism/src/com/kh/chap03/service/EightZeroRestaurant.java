package com.kh.chap03.service;

public class EightZeroRestaurant extends BlackBeanSauceNoodles implements DeliveryServiceI, Skill{

	@Override
	public void makeNoodles() {
		System.out.println("면은 기계면 치고는 맛있는 짜장");
		}
	
		
	@Override
	public void delivery() {
		System.out.println("드론 배달");
	}
	
}
