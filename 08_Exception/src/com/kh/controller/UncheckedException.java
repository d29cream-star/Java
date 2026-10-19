package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	public void divZero() {
		//System.out.println("문자");
		//System.out.println(10/0);//오류
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나누기 프로그램");
		System.out.print("첫번째 정수를 입력해주세요.");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요.");
		int num2 = sc.nextInt();
				
		if(num2!=0) {
			System.out.println("나눗셈 결과: " + num1 / num2);
		}else {
			System.out.println("0은 나누기 연산을 수행할 수 없습니다.");
		}
	
		try {
			System.out.println("나눗셈 결과: " + num1 / num2);
			System.out.println("참잘했어요");
		} catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("두번째 정수에 0을 입력할 수 없습니다.");
		}
		sc.close();
		System.out.println("메소드 호출 끝");
	
		}
		
	public void input() {
		Scanner sc =new Scanner(System.in);
		while(true)	{
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 추가하기");
			System.out.println("2. 삭제하기");
			System.out.println("3. 종료하기");
			System.out.println("1번 또는 2번을 선택해주세요.");
			int menu;
			
			try {
				menu = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
			}
			
			System.out.println(menu + "번호을 선택하셨습니다.");
		
		}
		
		
		
		
	}
	
}
	
	

