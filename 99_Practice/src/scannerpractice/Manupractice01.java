package scannerpractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Manupractice01 {

	public void inputInfo() {

		Scanner sc = new Scanner(System.in);

		System.out.println("★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("투썸플레이스 A Twosome Place");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("      겨울엔 역시 스초생      ");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("          MENU           ");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("아메리카노/라떼/카푸치노/카페모카");

		System.out.print("어떤 커피를 하시겠어요?");
		String manu = null;
		try {
			manu = sc.nextLine();
		} catch (InputMismatchException e) {

		}

		System.out.print("따듯한걸로 하시겠어요? 아이스로 하시겠어요?");
		String temp = null;
		try {
			temp = sc.nextLine();
		} catch (InputMismatchException e) {

		}
		System.out.print("원두를 골라주세요.");
		String type = null;
		try {
			type = sc.nextLine();
		} catch (InputMismatchException e) {

		}

		System.out.print("몇 잔 드릴까요?");
		int count = 0;
		try {
			count = sc.nextInt();
		} catch (InputMismatchException e) {

		}
		sc.nextLine();
		System.out.println(type + " 원두로 " + temp + manu + count + " 잔 준비해드리겠습니다. 잠시만 기다려주세요.");
		sc.close();

	}
}
