package conditionpractice01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConditionElse {

	public void ageCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		int age = 0;
		try {
			age = sc.nextInt();
		} catch (InputMismatchException e) {

		}

		if (age <= 0) {
			System.out.println("다시 입력해주세요.");
		} else if (age >= 18) {
			System.out.println("성인입니다.");
		} else if (age <= 12) {
			System.out.println("아동입니다.");
		} else {
			System.out.println("청소년입니다.");
			sc.close();
		}
	}

	public void conditionSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 층으로 가세요.");
		String floor = null;
		try{
			floor = sc.nextLine();
		}catch(InputMismatchException e) {
			
		}

		switch (floor) {
		case "1":
			System.out.println("1층");
			break;
		case "2":
			System.out.println("2층");
			break;
		default:
			System.out.println("옥상");
			sc.close();
		}
	}

	public void starMaker() {
		// System.out.print("*");

		// for(int i = 1; i <= 5; i++) {
		// System.out.print("*");}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
