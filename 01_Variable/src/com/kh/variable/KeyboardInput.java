package com.kh.variable;

import java.util.Scanner;

public class KeyboardInput {

	public void inputInfo() {
		//System.out.println("부르기 성공");
		Scanner sc = new Scanner(System.in);
		//sc.next();
	
		
		System.out.println("25년 전통의 오리지널 메뉴");
		System.out.println("맛도 두 배 크기도 두 배");
		System.out.println("------메뉴판------");
		System.out.println("매운 페퍼로니 치즈 돈까스");
		System.out.println("남산 왕 돈까스");
		System.out.println("철판 함박 스테이크");
		System.out.println("=================");
		
		System.out.print("주문하실 메뉴를 입력해주세요.>  ");
		String menu = sc.next();
		System.out.println(menu + "를 주문하셨습니다.");
		
		System.out.print("몇 개 주문하시겠습니다?(숫자로 입력해주세요.) > ");
		int count = sc.nextInt();
		System.out.println(menu + "를 " + count + "개 주문하셨습니다.");
		
		sc.nextLine();
		System.out.print("주소지를 입력해주세요. > ");
		String address = sc.nextLine();
		System.out.println(menu + " "+ count + "개를 " +address+ "로 배달합니다.");
		
		
	}
	
}

