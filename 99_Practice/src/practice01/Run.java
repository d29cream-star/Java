package practice01;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//실습문제 1
		try {
		System.out.print("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.print("성별을 입력하세요.(남/여)");
		char gender = sc.nextLine().charAt(0);
		System.out.print("나이를 입력하세요.");
		int age = sc.nextInt();sc.nextLine();
		System.out.print("키를 입력하세요.");
		double height = sc.nextDouble();
		System.out.println("키" + height + "cm 인 " + age + "살 " + gender +" "+ name + "님 반갑습니다.");
		
		//실습문제 2
		System.out.print("첫번째 정수를 입력하세요.");
		int num = sc.nextInt();sc.nextLine();
		System.out.print("두번째 정수를 입력하세요.");
		int num2 = sc.nextInt();sc.nextLine();
		
		System.out.println("더하기 결과 : " + (num + num2));
		System.out.println("빼기 결과 : " + (num - num2));
		System.out.println("나누기 몫 결과 : " + (num/num2));
		System.out.println("곱하기 결과 : " + (num * num2));
		
		
		//실습문제 3
		
		System.out.print("키보드의 가로 값을 입력하세요."	);
		double a = sc.nextDouble();sc.nextLine();
		System.out.print("키포드의 세로 값을 입력하세요.");
		double b = sc.nextDouble();sc.nextLine();
		System.out.println("면적: " + (a*b));
		System.out.println("둘레: " + ((a+b)*2));
		
		
		//실습문제 4
		System.out.print("문자열을 입력하세요.");
		String s = sc.nextLine();
		System.out.println("첫번째문자 : " + s.charAt(0));
		System.out.println("두번째문자 : " + s.charAt(1));
		System.out.println("세번째문자 : " + s.charAt(2));
		}catch(RuntimeException e) {
			e.printStackTrace();
		}sc.close();
		
		
	}

	
}
