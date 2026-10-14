package run;

import objectpractice02.Dog;

import java.util.Scanner;

import objectpractice02.Box;

public class Run02 {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.setAge(10);
		d.setName("똘이");
		d.setColor("white");
		d.setSpecies("maltese");

		d.Info();
		// System.out.println(d.Info());

		Scanner sc = new Scanner(System.in);
		Box b = new Box();
		System.out.print("상자의 재질을 선택하세요.>");
		b.setTexture(sc.nextLine());

		while (true) {
			System.out.println();
			System.out.println("1. 쌓기 2. 제거하기 3. 프로그램 종료");
			System.out.print("메뉴 숫자를 선택하세요.>");
			int menuNo = sc.nextInt();
			sc.nextLine();
			switch (menuNo) {
			case 1:
				b.pileup();
				System.out.println(b.getTexture() + "상자 1개가 쌓여 " + b.getHeight() + " 높이가  되었습니다.");
				break;
			case 2:
				b.remove();
				System.out.println(b.getTexture() + "상자 1개가 제거되어 " + b.getHeight() + " 높이가 되었습니다.");
				break;
			case 3:
				return;
			}

		}

	}

}
