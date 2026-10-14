package com.kh.loop;

import java.util.Scanner;

public class LoopWhile {

	public void method0() {
		
		int i = 0;
		while(i <3) {
			 i++; System.out.println(i);
		}
	}
	public void method1() {
		while(true) {
			System.out.println("이렇게 사용");
		}
	}
	public void method2() {
		
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum += 1;
			i++;}
		System.out.println(sum);
	}

	public void method3() {
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {System.out.println(sum+=1);}
	}
	public void generateLottoNumber() {
		//math m = new Math();
		//System.out.println(Math.random());	
		/*double number = Math.random();
		System.out.println(number * 10);
		System.out.println((int)(number*10));
		System.out.println((int)(number*10)+1);
		
		System.out.println((int)(number*45)+1);*/
		
		int num1 = (int)(Math.random()*45 +1);
		int num2 = (int)(Math.random()*45 +1);
		int num3 = (int)(Math.random()*45 +1);
		int num4 = (int)(Math.random()*45 +1);
		int num5 = (int)(Math.random()*45 +1);
		int num6 = (int)(Math.random()*45 +1);
		System.out.printf("오늘의 운세 %d, %d, %d, %d, %d, %d ",num1,num2,num3,num4,num5,num6);
		
		
	}
	public void method4() {//입력받은 문자열의 길이 출력/ 단, exit면 반복 종료
		Scanner sc = new Scanner(System.in);
		
		while(true) {System.out.print("글자수 체크(종료는 exit)");
		String keyword = sc.nextLine();
		System.out.println(keyword + "은(는)" + keyword.length() + "글자입니다."); //(띄어쓰기 포함)
		
		if(keyword.equals("exit")){
			//break;}
			return;	}
		
	//	System.out.println("여기까지");
	
		}
}
	
	public void checkId() {
		System.out.println("회원가입 서비스입니다.");
		Scanner sc = new Scanner(System.in);
		
		while(true) {System.out.print("아이디 10글자 이하 입력");
			String userId = sc.nextLine();
			if(userId.length()> 10) {System.out.println("재시도(아이디 10글자 이하)");
			continue;
			}else {
				System.out.println("사용가능");
				break;}
			}
			System.out.println("비밀번호 입력");
		}
			
	}