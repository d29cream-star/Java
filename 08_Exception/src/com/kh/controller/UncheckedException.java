package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.EnterFiveException;

public class UncheckedException {

	public void divZero() {
		// System.out.println("문자");
		// System.out.println(10/0);//오류

		Scanner sc = new Scanner(System.in);
		System.out.println("나누기 프로그램");
		System.out.print("첫번째 정수를 입력해주세요.");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요.");
		int num2 = sc.nextInt();

		if (num2 != 0) {
			System.out.println("나눗셈 결과: " + num1 / num2);
		} else {
			System.out.println("0은 나누기 연산을 수행할 수 없습니다.");
		}

		try {
			System.out.println("나눗셈 결과: " + num1 / num2);
			System.out.println("참잘했어요");
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println("두번째 정수에 0을 입력할 수 없습니다.");
		}
		sc.close();
		System.out.println("메소드 호출 끝");

	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 추가하기");
			System.out.println("2. 삭제하기");
			System.out.println("3. 종료하기");
			System.out.println("1번 또는 2번을 선택해주세요.");
			int menu = 0;

			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
			}
			sc.nextLine();
			System.out.println(menu + "번호을 선택하셨습니다.");

		}
	}

	public int multiCatch() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하시요>");

		/*
		 * 8try{int num = sc.nextInt(); }catch(InputMismatchException e){ sc.close(); }
		 * try { return (100 / num); }catch(ArithmeticException e) {
		 * 
		 * }
		 */

		try {
			int num = sc.nextInt();
			// sc.close();
			return (100 / num);
		} catch (InputMismatchException e) {
			System.out.println("숫자값을 입력해주세요.");
			// sc.close();
			return 0;
		} catch (ArithmeticException e) {
			System.out.println("0이 아닌 정수값을 입력하세요.");
			return 0;
		} finally {
			sc.close();// return직전에 항상 finally 블럭 부터 수행

		}

	}

	public void orderByCatch() {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시요 > ");

		try {
			int num = sc.nextInt();
			int[] nums = new int[num];
			System.out.println(nums[100]);
		} catch (InputMismatchException e) {
			System.out.println("믹스매치");
		} catch (RuntimeException e) {
			System.out.println("다형성");
		}
		sc.close();

	}
	public void bomb() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오>");
		int num = sc.nextInt();
		sc.close();
		if(num == 5) {
			throw new EnterFiveException("사용자가 5를 입력함!!!");
		}
		
	}

}