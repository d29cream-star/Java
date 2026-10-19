package com.kh.condition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConditionIf {

	public void method0() {
		
		if (true){
			System.out.println("문제 없음");
		}
		if (false) {
			System.out.println("문제 있음");
			
		}
	}
	public void method1() {
	
		int starNum = 0;
		if (starNum > 1) {System.out.println("*");	
		}
		
	}
	public void quiz() {
		
		int count = 0;
		int wrongCount = 0;
		
		System.out.println(" 잼컨만들기 ");
		System.out.println("-----------------");
		System.out.println("토마토는 과일일까요?");
		Scanner sc = new Scanner(System.in);
		System.out.print("정답을 o 또는 x로 입력하세요.");
		char answer = ' ';
		try{
			answer = sc.nextLine().charAt(0);
		}catch(InputMismatchException e) {

		}
		if (answer == 'x'||answer == 'X') {System.out.println("정답입니다.");count++;
		}
		if (answer == 'o'||answer == 'O') {System.out.println("오답입니다.");wrongCount++;
		}
		if (answer != 'x'&& answer !='X' && answer != 'o' && answer != 'O') {System.out.println("다시 입력하세요");wrongCount++;
		}
		
		
		System.out.println("문제 : 기린은 서서 잠을 잔다."	);
		System.out.print("정답을 o 또는 x로 입력하세요.");
		try{
			answer = sc.nextLine().charAt(0);
		}catch(InputMismatchException e) {
			
		}
		if(answer == 'o' || answer == 'O') {System.out.println("정답입니다.");count++;
		}
		if(answer == 'x' || answer == 'X') {System.out.println("오답입니다.");wrongCount++;
		}
		if(!(answer == 'o'||answer == 'O'||answer == 'x'||answer == 'X')) {System.out.println("다시 입력하세요.");wrongCount++;
		}
		sc.close();
		System.out.println("-------------------");
		System.out.println("퀴즈의 결과");
		System.out.println("정답:" + count + "개");
		System.out.println("오답:" + wrongCount + "개");
		
	}
}

