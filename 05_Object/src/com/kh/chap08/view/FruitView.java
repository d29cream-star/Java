package com.kh.chap08.view;

import java.util.Scanner;

import com.kh.chap08.controller.FruitController;
import com.kh.chap08.model.dto.Fruit;

public class FruitView {

	private Scanner sc = new Scanner(System.in);
	private FruitController fc = new FruitController();

	public void mainMenu() {

		while (true) {
			System.out.println("과수원 관리 프로그램");
			System.out.println("1. 과일 심기");
			System.out.println("2. 과일 정보 확인하기");
			System.out.println("3. 비료주기");
			System.out.println("4. 과일 수확하기");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴 선택>>>");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				saveFruit();
				break;
			case 2:
				findFruit();
				break;
			//case 3:
			//	fertilize();
			//	break;
			case 4:
				harvest();
				break;
			case 5:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("없는 메뉴입니다.");

			}
		}

	}

	private void saveFruit() {

		if (fc.findFruit() != null) {
			System.out.println("과일이 존재합니다. 먼저 심어주세요.");
			return;
		}
			System.out.print("과일 명 입력>>");
			String Name = sc.nextLine();
			System.out.print("과일 품종 입력>>");
			String Species = sc.nextLine();

			fc.saveFruit(Name, Species);


	}

	private void findFruit() {
		System.out.println("과일의 정보");
		Fruit[] fruits = fc.findFruit();
		//if (fruit != null) {
		//	String info = fruit.info();
		//	System.out.println(info);
		//} else {
		//	System.out.println("심은 과일이 없습니다. 과일을 먼저 심어보세요.");
		//}
			/*if(fruits[0] !=null) {
				System.out.println(fruits[0].info());
			}
			if(fruits[1] !=null) {
				System.out.println(fruits[1].info());
			}
			if(fruits[2] !=null) {
				System.out.println(fruits[2].info());
			}*/
			
			for(int i = 0; i< fruits.length;i++) {
				if(fruits[i] !=null) {
					System.out.println(fruits[i].info());
			}
		}

	}

	/*private void fertilize() {
		System.out.println("비료주기"); // 당도올리기 현재 당도+1

		if (fc.findFruit() != null) {
			fc.fertilize();
			System.out.println("당도 1 증가");
		} else {
			System.out.println("심은 과일이 없습니다. 과일을 먼저 심어보세요.");
		}

	}*/

	private void harvest() {

		if (fc.findFruit() != null) {
			fc.harvest();
			System.out.print("수확하시겠습니까?");
			findFruit();
			System.out.print("수확을 원하시면 수확하기를 입력해주세요.");
			String answer = sc.nextLine();
			if(answer.equals("수확하기")){
				fc.harvest();
								
			}else {System.out.println("메인메뉴로 돌아값니다.");
		
		} 
		}else {
			System.out.println("심은 과일이 없습니다. 과일을 먼저 심어보세요.");
	}

}
}