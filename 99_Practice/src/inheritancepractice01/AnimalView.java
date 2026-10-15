package inheritancepractice01;

import java.util.Scanner;

public class AnimalView {
	private Scanner sc = new Scanner(System.in);
	private AnimalController ac = new AnimalController();

	public void mainmenu() {
		System.out.println("어쩌구 동물병원");
		System.out.println("1. 동물 등록하기 2.등록정보 확인 3.먹이주기 4.프로그램 종료");
		System.out.println("============================================");
		System.out.println("번호를 입력해주세요.");
		int menuNo = sc.nextInt();
		sc.nextLine();
		while (true) {
			switch (menuNo) {
			case 1:
				join();
				break;
			case 2:
				check();
				break;
			case 3:
				feed();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				return;
			}
		}
	}
	public void join() {
		System.out.print("반려동물의 이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.print("반려동물의 나이를 입력해주세요.");
		int age = sc.nextInt();sc.nextLine();
		System.out.print("반려동물의 종을 입력해주세요.");
		String species = sc.nextLine();
		ac.join(name, age, species);
		System.out.println("등록이 완료 되었습니다.");
	}

	public void check() {
		System.out.println("반려동물의 이름을 입력해주세요.");
		String name = sc.nextLine();
		ac.check(name);
		System.out.println("확인되었습니다.");
		System.out.println("등록하신 동물 정보 " + toString());
		
		}

	public void feed() {

	}

}
