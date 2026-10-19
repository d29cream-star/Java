package run;

import java.util.InputMismatchException;
import java.util.Scanner;

import objectpractice02.BankAccount;

public class Run04 {

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
			int menuNo = 0;
			try{
				menuNo = sc.nextInt();
			}catch(InputMismatchException e) {
				
			}
			sc.nextLine();

			switch (menuNo) {
			case 1:
				ba.deposit();
				System.out.println("1000원 입금하여 현재 잔고 " + ba.getBalance() + "원 입니다.");
				break;
			case 2:
				ba.withdraw();
				if (ba.getBalance() < 0) {
					System.out.println("출금할 수 없습니다.");
				} else {
					System.out.println("1000월 출금하여 현재 잔고 "+ ba.getBalance() + "원 입니다.");
					break;
				}
			case 3:
				sc.close();return;

			}
		}

	}

}
