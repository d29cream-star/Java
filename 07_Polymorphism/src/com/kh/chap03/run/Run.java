package com.kh.chap03.run;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.chap03.service.BlackBeanSauceNoodles;
import com.kh.chap03.service.DeliveryServiceI;
import com.kh.chap03.service.EightZeroRestaurant;
import com.kh.chap03.service.HongChineseRestaurant;

public class Run {

	public static void main(String[] args) {

		// blackBeanSauceNoodles

		System.out.println("짜장면 주문 서비스");
		System.out.println("중국집 선택");
		System.out.println("1. 홍반점");
		System.out.println("2. 팔공반점");
		System.out.print("메뉴 선택");
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		try {
			menuNo = sc.nextInt();
		} catch (InputMismatchException e) {
			sc.close();
		}
		BlackBeanSauceNoodles bbsn = null;
		DeliveryServiceI d = null;
		switch (menuNo) {
		case 1:
			bbsn = new HongChineseRestaurant();
			d = new HongChineseRestaurant();
			bbsn.makeNoodles();
			d.delivery();
			break;
			
		case 2:
			bbsn = new EightZeroRestaurant();
			d = new EightZeroRestaurant();
			bbsn.makeNoodles();
			d.delivery();
			break;
			
		}

	}

}
