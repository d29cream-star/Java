package practice01;

import java.util.Scanner;

public class Run2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요.");
		int num = sc.nextInt();
		sc.nextLine();
		if (num < 0) {
			System.out.println("양수가 아니다.");
		} else if (num > 0) {
			System.out.println("양수다");
		}

		System.out.print("정수를 입력하세요.");
		int num2 = sc.nextInt();
		sc.nextLine();
		if (num > 0) {
			System.out.println("양수다");
		} else if (num == 0) {
			System.out.println("0이다");
		} else {
			System.out.println("음수다");
		}

		System.out.print("정수를 입력하세요.");
		int num3 = sc.nextInt();
		sc.nextLine();
		if (num3 % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}

		System.out.print("학생수를 입력하세요.");
		int mannum = sc.nextInt();
		sc.nextLine();
		System.out.print("사탕의 개수를 입력하세요.");
		int candynum = sc.nextInt();
		sc.nextLine();
		System.out.println("1인당 사탕 개수 : " + (candynum/mannum));
		System.out.println("남은 사탕의 개수 : " + (candynum%mannum));
		
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.println("학년 :");
		int year = sc. nextInt();
		sc.nextLine();
		System.out.println("반 :");
		int classnum = sc. nextInt();
		sc.nextLine();
		System.out.println("번호 :");
		int stnum = sc. nextInt();
		sc.nextLine();
		System.out.println("성별 :");
		char sex = sc.nextLine().charAt(0);
		System.out.print("성적 :");
		double score = sc.nextDouble();
		sc.nextLine();
		System.out.println(year + "학년 " + classnum + "반 "+ stnum + "번 " + name + " "+ sex+"학생의 성적은 " + score + "이다.");
	
	
	
	
	
	
	}

}
