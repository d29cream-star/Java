package run;

import java.util.Scanner;

import objectpractice02.BankAccount;

public class Run03 {

	public static void main(String[] args) {

		BankAccount ba = new BankAccount();
		Scanner sc = new Scanner(System.in);

		ba.setOwner("땡땡");
		ba.setBalance(0);

		System.out.println("한국은행의 " + ba.getOwner() + "님 계좌 잔고는 " + ba.getBalance() + "원 입니다.");

		while (true) {
			System.out.println();
			System.out.println("1. 입금 2. 출금 3. 프로그램종료");
			System.out.print("메뉴를 선택해주세요.>");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				System.out.print("입금하실 금액을 입력해주세요.>");
				int input = sc.nextInt();
				sc.nextLine();
				ba.deposit();
				ba.setBalance(ba.getBalance() + input);
				System.out.println(input + " 원 입금하여 현재 잔고 " + ba.getBalance() + "원 입니다.");
				break;
			case 2:
				System.out.print("출금하실 금액을 입력해주세요.>");
				int output = sc.nextInt();
				sc.nextLine();
				ba.withdraw();
				if (output <= ba.getBalance()) {
					System.out.println(output + "원 출금하였습니다.");
					ba.setBalance(ba.getBalance() - output);
					System.out.println("잔고는 " + ba.getBalance() + "입니다.");break;
				} else {
					System.out.println("잔액이 부족합니다.");
					break;
				}
			case 3:
				return;

			}
		}

	}

}
