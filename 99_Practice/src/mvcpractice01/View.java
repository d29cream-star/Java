package mvcpractice01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class View {

	private Scanner sc = new Scanner(System.in);
	private Controller c = new Controller();

	public void mainMenu() {
		while (true) {
			System.out.println("머시기 카페");
			System.out.println("메뉴");
			System.out.println("1. 메뉴 등록>");
			System.out.println("2. 메뉴 삭제>");
			System.out.println("3. 메뉴 조회>");
			System.out.println("4. 처음으로");
			System.out.print("메뉴를 선택해주세요>>");
			int Menunum = 0;
			try {
				Menunum = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			}finally {
				
				sc.nextLine();
			}
			switch (Menunum) {
				case 1:
					create();
					break;
				case 2:
					remove();
					break;
				case 3:
					read();
					break;
				case 4:
					System.out.println("프로그램 종료");
					sc.close();
					return;
				default: System.out.println("잘못누르셨습니다.");
	
			}
		}
	}

	public void create() {
		System.out.print("등록하실 이름을 입력하세요>");
		String name = sc.nextLine();
		System.out.print("등록하실 가격을 입력하세요>");
		int price = 0;
		try {
			price = sc.nextInt();
		} catch (InputMismatchException e) {
		
		}finally {
			sc.nextLine();
		}
		c.create(name, price);
		read();
		System.out.println("등록이 완료되었습니다.");
	}

	public void remove() {
		System.out.print("제거하실 메뉴 이름을 입력해주세요.>");
		String name = sc.nextLine();
		c.remove(name);
		read();

	}

	public void read() {
		List<Cafe> cafes = c.read();
		System.out.println("메뉴판입니다.");
		if(!(cafes.isEmpty())) {
			for(Cafe c : cafes ) {
				System.out.println(c.getName() + c.getPrice());
			}
		}else {
			System.out.println("메뉴가 없습니다.");
		}
		

	}

}
