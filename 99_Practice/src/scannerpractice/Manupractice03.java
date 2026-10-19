package scannerpractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Manupractice03 {

	public void inputInfo() {

		System.out.println("   불독냉면 BULLGOD   ");
		System.out.println("🐶🐶🐶🐶🐶메뉴🐶🐶🐶🐶🐶");
		System.out.println("       불독냉면");
		System.out.println("       비빔냉면");
		System.out.println("       물냉면🍜");

		Scanner sc = new Scanner(System.in);

		System.out.print("메뉴선택 ☞☞☞☞");
		String manuName = null;
		try{
			manuName = sc.nextLine();
		}catch(InputMismatchException e) {
			
		}

		System.out.print("수량선택 ☞☞☞☞");
		int manuNum = 0;
		try{
			manuNum = sc.nextInt();
		}catch(InputMismatchException e) {
			
		}

		System.out.print(manuName + " " + manuNum + "개를 주문하셨습니다.");
		sc.close();
	}
}
