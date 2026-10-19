package com.kh.condition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConditionSwitch {
	
	public void method0() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 층 가세요?(B1/B2/B3)");
		String floor = null;
		try{
			floor = sc.nextLine();
		}catch(InputMismatchException e) {
		}
		switch(floor){
		case "B1" : System.out.println("지하 1층 입니다."); break;
		case "B2" : System.out.println("지하 2층 입니다."); break;
		case "B3" : System.out.println("지하 3층 입니다."); 
		sc.close();}
	}
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 번호를 입력하세요.");
		int menuNo = 0;
		try{
			menuNo = sc.nextInt();
		}catch(InputMismatchException e) {
			
		}
		
		int price = menuNo == 1 ? 1000
				  : menuNo == 2 ? 500
				  : menuNo == 3 ? 4000
				  : menuNo == 4 ? 1000
				  : 0;
		sc.close();
		System.out.println(menuNo + "번 메뉴는 " + price + "원 입니다.");
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 번호를 입력하세요.");
		int menuNo = 0;
		try{
			menuNo = sc.nextInt();
		}catch(InputMismatchException e) {
			
		}
		
		int price = switch(menuNo) {
		case 1, 4 -> 1000;
		case 2 -> 500;
		default -> 0;
		};
		sc.close();
		System.out.println(menuNo + "번 메뉴는 " + price + "원 입니다.");
		}
}
