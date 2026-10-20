package inheritancepractice01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnimalView {
	private Scanner sc = new Scanner(System.in);
	private AnimalController ac = new AnimalController();

	public void mainmenu() {

		while (true) {
			System.out.println("어쩌구 동물병원");
			System.out.println("1. 동물 등록하기 2.등록정보 확인 3.맞춤사료추천 4.프로그램 종료");
			System.out.println("============================================");
			System.out.print("번호를 입력해주세요.");
			int menuNo = 0;
			try {
				menuNo = sc.nextInt();
			} catch (InputMismatchException e) {

			} finally {
				sc.nextLine();
			}
			switch (menuNo) {
			case 1:
				join();
				break;
			case 2:
				check();
				break;
			case 3:
				recommendFood();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				sc.close();
				return;
			}
		}
	}

	public void join() {
		System.out.println("동물의 종을 선택해주세요.");
		System.out.println("1. 개, 2.고양이");
		System.out.print("숫자 입력>>");
		int num = 0;
		try {
			num = sc.nextInt();
		} catch (InputMismatchException e) {

		}
		sc.nextLine();
		System.out.print("반려동물의 이름을 입력해주세요.");
		String name = null;
		try {
			name = sc.nextLine();
		} catch (InputMismatchException e) {

		}
		System.out.print("반려동물의 나이를 입력해주세요.");
		int age = 0;
		try {
			age = sc.nextInt();
		} catch (InputMismatchException e) {
		}
		sc.nextLine();
		String species = null;
		String color = null;
		
		switch (num) {
		case 1:
			System.out.println("종을 입력해주세요.");
			species = sc.nextLine();
			break;
		case 2:
			System.out.println("털색을 입력해주세요.");
			color = sc.nextLine();
			break;
		default:
			System.out.println("다시 입력해주세요.");
			return;
		}

		ac.join(num, name, age, species, color);
		System.out.println("등록이 완료 되었습니다.");
	}

	public void check() {
		System.out.print("반려동물의 이름을 입력해주세요.");
		String name = null;
		try {
			name = sc.nextLine();
		} catch (InputMismatchException e) {

		}
		Animal result = ac.check(name);

		if (result != null) {
			System.out.println("확인되었습니다.");
			System.out.println("등록하신 동물 정보 " + result.toString());

		} else {
			System.out.println("등록하신 정보가 없습니다.");
		}
	}

	public void recommendFood() {
		System.out.print("반려동물의 이름을 입력해주세요.");
		String name = null;
		try {
			name = sc.nextLine();
		} catch (InputMismatchException e) {

		}
		Animal result = ac.check(name);

		if (result != null) {
			System.out.println("확인되었습니다.");
			System.out.println("등록하신 동물 정보 " + result.toString());
			System.out.println(result.getName() + "의 추천 사료를 제공드립니다.");
			
		} else {
			System.out.println("등록하신 정보가 없습니다.");
		}

	}

}
