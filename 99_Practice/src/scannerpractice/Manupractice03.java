package scannerpractice;

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
		String manuName = sc.nextLine();
		
		System.out.print("수량선택 ☞☞☞☞");
		int manuNum	= sc.nextInt();
		
		System.out.print(manuName +" " + manuNum + "개를 주문하셨습니다.");
	}
}

