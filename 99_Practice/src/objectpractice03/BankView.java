package objectpractice03;

import java.util.Scanner;

public class BankView {

	private Scanner sc = new Scanner(System.in);
	private BankController bc = new BankController();

	public void menuSystem() {

		while (true) {
			System.out.println();
			System.out.println("메뉴선택");
			System.out.println("1. 계좌개설 2. 입금 3. 출금 4. 나가기");
			System.out.print("메뉴 번호를 선택해 주세요.>");
			int menuNum = sc.nextInt();
			sc.nextLine();
			switch (menuNum) {
			case 1:
				craft();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				return;
			default:
				System.out.println("다시 선택해주세요.");
				break;

			}
		}

	}

	public void craft() {

		System.out.print("성함을 입력해주세요.>");
		String name = sc.nextLine();
		System.out.println("한국은행 " + name + " 님의 계좌가 개설되었습니다.");

		System.out.println();
		System.out.print("비밀번호를 4자리를 입력해주세요.>");
		String pinNum = sc.nextLine();
		System.out.println("비밀번호가 설정되었습니다.");
		int balance = 0;
		System.out.println("계좌 잔액은 " + balance + " 원 입니다.");

		bc.craft(name, balance, pinNum);

	}

	public void deposit() {
		BankAccount ba = bc.deposit();
		if (ba == null) {
			System.out.println("계좌 개설을 진행해주세요.");
		} else {

			while (true) {
				System.out.print("입금하실 금액을 입력해주세요.>");
				int input = sc.nextInt();
				sc.nextLine();
				
				if (input >= 0) {
					int balance = bc.deposit(input);
					System.out.println(input + " 원 입금하셨습니다.");
					System.out.println(ba.getName() + "님의 계좌에는 " + ba.getBalance() + " 원 있습니다.");
					break;
				} else {
					System.out.println("입금액을 다시 확인해주세요.");
				}
			}
		}
	}

	public void withdraw() {
		BankAccount ba = bc.withdraw();
		if (bc.withdraw() == null) {
			System.out.println("계좌 개설을 진행해주세요.");
		} else {

			while (true) {

				System.out.print("출금을 위하여 비밀번호를 입력해주세요.>");
				String pin = sc.nextLine();

				if (!ba.getPinNum().equals(pin)) {
					System.out.println("다시 입력해주세요.");
				} else {

					System.out.print("출금하실 금액을 입력해주세요.>");
					int output = sc.nextInt();
					sc.nextLine();
					int balance = bc.withdraw(output);
					if (output <= ba.getBalance() && output > 0) {
					
						System.out.println(output + " 원 출금하셨습니다.");
						
						System.out.println(ba.getName() + "님의 계좌에는 " + ba.getBalance() + " 원 있습니다.");
					} else if (output < 0) {
						System.out.println("출금액은 0보다 커야합니다.");
					} else {
						System.out.println("잔액이 부족합니다.");
					}
				}
			}
		}
	}
}