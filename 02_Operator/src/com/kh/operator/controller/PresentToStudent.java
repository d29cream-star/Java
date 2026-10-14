package com.kh.operator.controller;

import java.util.Scanner;

public class PresentToStudent {
	
	public void presentToStudent() {
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요");
		int studentCount = sc.nextInt();
		System.out.println("입력받은 학생 수 : " + studentCount);
		
		System.out.println("나눠줄 비타민 개수를 입력하세요");
		int vitaminCount = sc.nextInt();
		System.out.println("입력받은 비타민 수 : " + vitaminCount);
		
		
		System.out.println("한 사람 당 받을 수 있는 비타민의 개수: " + (vitaminCount/studentCount));
		System.out.println("남는 비타민의 개수: " + (vitaminCount % studentCount));
		
	}
	public void practice() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력하세요.");
		int intNum = sc.nextInt();
		boolean result = (intNum > 0) && (intNum % 2 == 0);
		System.out.println("입력값이 0보다 크면서 짝수 입니까?" + result);
		//System.out.print((intNum > 0) && ((intNum % 2) == 0));
		
	}
	public void andOper(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값을 입력하세요");
		int num = sc.nextInt();

		System.out.println("입력한 정수값 :"+ num);
		boolean result = num >= 1 && num <= 5;
		System.out.println("입력값이 1부터 5 사이의 값인가요?" + result);
		//System.out.println((1 <= num) && (num <= 5));
	}

	public void orOper() {
		Scanner sc = new Scanner(System.in);
		System.out.println("한 글자만 입력하세요");
		
		char letter = sc.nextLine().charAt(0);
		System.out.println(letter);
		boolean result = (letter == 'a' ) || (letter == 'A');
		System.out.println(result);
		
	}
	public void tip() {
		int num = 10;
		boolean result = false && (num > 0); 
	}
	
	public void triple() {
		System.out.println("영화루에 오신 것을 환영합니다.");
		System.out.println("메뉴를 선택해주세요.");
		System.out.println("1. 고추간짜장");
		System.out.println("2. 고추짬뽕");
		System.out.print("번호를 입력해주세요.");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String selected = num == 1 ? "고추간짜장을 주문하셨습니다."
						: num == 2 ? "고추짬뽕을 주문하셨습니다."
						: "없는 메뉴입니다.";
		
		System.out.println(selected);
		
		
		
	}		

	}
	
	
