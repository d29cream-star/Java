package com.kh.condition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConditionElse {

	public void method1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 번호를 입력해주세요.");
		String phoneNum = null;
		try {
			phoneNum = sc.nextLine();
		} catch (InputMismatchException e) {
		}
		// System.out.println(phoneNum.equals("010-7777-7777")||phoneNum.equals("01077777777"));
		if (phoneNum.equals("01077777777") || phoneNum.equals("010-7777-7777")) {
			System.out.println("당첨입니다. 축하합니다.");
		} else {
			System.out.println("다음 기회에");
			sc.close();
		}
	}

	public void method2() {

		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 뒤 4자리를 입력하세요.");
		String phoneNum = null;
		try {
			phoneNum = sc.nextLine();
		} catch (InputMismatchException e) {

		}
		System.out.println("사용자가 입력한 폰번호 : " + phoneNum);

		if (phoneNum.equals("1234")) {
			System.out.println("1등 입니다.");
		} else if (phoneNum.equals("5678")) {
			System.out.println("2등 입니다.");
		} else if (phoneNum.equals("1111")) {
			System.out.println("3등 입니다.");
		} else {
			System.out.println("아쉽지만 다음 기회에");
		}
		sc.close();
	}

	public void method3() {

		Scanner sc = new Scanner(System.in);
		System.out.println("0~9까지 번호 뽑기");
		System.out.print("0~9까지의 번호 중 하나 입력하세요.");
		char num = ' ';
		try {
			num = sc.next().charAt(0);
		} catch (InputMismatchException e) {
		}
		if (num == '2') {
			System.out.println("1등입니다.");
		} else if (num == '9') {
			System.out.println("2등입니다.");
		} else {
			System.out.println("탈락입니다.");
			sc.close();
		}
	}

	public void ageCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요.");
		int age = 0;
		try{
			age = sc.nextInt();
		}catch(InputMismatchException e) {	
		}
		if (1 <= age && age <= 12) {
			System.out.println("어린이입니다.");
		} else if (13 <= age && age <= 17) {
			System.out.println("청소년입니다.");
		} else if (18 <= age) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}sc.close();
	}

}
