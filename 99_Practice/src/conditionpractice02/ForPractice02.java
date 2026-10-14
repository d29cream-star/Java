package conditionpractice02;

import java.util.Scanner;

public class ForPractice02 {

	public void menuMaker() {

		Scanner sc = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		int price1 = 5000;
		int price2 = 6000;
		String menuName;

		System.out.println("중국집");
		System.out.println("메뉴");
		System.out.println("짜장면 5000원");
		System.out.println("짬뽕 6000원");

		while (true) {
			System.out.print("메뉴 선택:");
			menuName = sc.nextLine();

			if(menuName.equals("짜장면")) {
				System.out.print("수량 선택:");
				count1 = sc.nextInt();
				sc.nextLine();
				System.out.println("짜장면 " + count1 + "개 주문완료, 가격은 " + (price1 * count1) + "입니다.");
			}
			else if (menuName.equals("짬뽕")) {
				System.out.print("수량 선택:");
				count2 = sc.nextInt();
				sc.nextLine();
				System.out.println("짬뽕 " + count2 + "개 주문완료, 가격은 " + (price2 * count2) + "입니다.");
			} 
			else if(menuName.equals("주문완료")){break;
				
			}
			
			else {System.out.println("다시 입력:");}
			}
		
		System.out.println("총액은 " + (price1 * count1 + price2 * count2) + "원 입니다.");
		
		}
}