package scannerpractice;

import java.util.Scanner;

public class Manupractice02 {

	public void inputInfo() {
		
		System.out.println("구구족은 족발 본연의 맛으로 승부합니다.");
		System.out.println("매장에서 갓 삶은 믿고 먹는 족발 맛집"); //""가 있는 문장은 어떻게 넣나요
		System.out.println("세상에서 가장 착한 족발, 구구족");
		System.out.println("🐷🐷🐷🐷🐷🐷메뉴🐖🐖🐖🐖🐖🐖");
		System.out.println("오리지널 순살 족발");
		System.out.println("담백한 보쌈");
		System.out.println("꼬들꼬들 옛날 미니족");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴를 선택해주세요.");
		String manuName = sc.nextLine();
		System.out.println(manuName + "을(를) 선택하셨습니다.");
		
		System.out.print("수량을 선택해주세요.");
		int manuNum = sc.nextInt();
		sc.nextLine();
		System.out.println(manuNum + "개를 선택하셨습니다.");
		
		System.out.println(manuName+" " + manuNum + "개를 준비하겠습니다. 잠시만 기다려주세요.");
		
	}
}
