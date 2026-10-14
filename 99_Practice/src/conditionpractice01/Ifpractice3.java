package conditionpractice01;

import java.util.Scanner;

public class Ifpractice3 {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("🍜🍜🍜🍜🍜국밥집🍜🍜🍜🍜🍜");
		System.out.println("🍜🍜🍜🍜🍜manu🍜🍜🍜🍜🍜");
		System.out.println("우거지국밥 8,000원");
		System.out.println("돼지국밥 8,500원");
		System.out.print("메뉴를 선택하세요.:");
		
		String menuName = sc.nextLine();
		while(menuName.equals("우거지국밥")||menuName.equals("돼지국밥")){System.out.print("수량을 선택하세요.:");
		sc.nextInt();
		System.out.print("추가하실 메뉴가 있으신가요?:");
		sc.nextLine();
		sc.nextLine();}
		while(!(menuName.equals("우거지국밥")||menuName.equals("돼지국밥"))){System.out.print("다시 입력해주세요.:");sc.nextLine();
		}
		
		
	
		
		
	}
	
}

