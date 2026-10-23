package practice01;

import java.util.Scanner;

public class Run3 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요.");
		int age = sc.nextInt();
		sc.nextLine();
		
		if(age > 19) {
			System.out.println("성인");
		}else if(age <= 13 && !(age <= 0)) {
			System.out.println("어린이");}
		else {System.out.println("청소년");
		}
		
		System.out.print("국어 점수를 입력하세요.");
		int korean = sc.nextInt();
		sc.nextLine();
		System.out.print("영어 점수를 입력하세요.");
		int english = sc.nextInt();
		sc.nextLine();
		System.out.print("수학 점수를 입력하세요.");
		int math = sc.nextInt();
		sc.nextLine();
		int sum = korean + english + math;
		double avr = (korean + english + math)/3;
		
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + avr);
		if(korean >= 40 && english >= 40 && math >= 40 && avr >= 60) {
			System.out.println("합격");
		}else {System.out.println("불합격");
		}
		
		System.out.println("주민번호 13자리를 입력하세요(-포함)");
		String number = sc.nextLine();
		
		
		
		
		
		
		
		
	}

}
