package mvcpractice03;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ShoppingView {

	private ShoppingController sc = new ShoppingController();
	private Scanner s = new Scanner(System.in);

	public void mainMenu() {
		while (true) {
			System.out.println("메뉴 선택");
			System.out.println("1. 제품 조회");
			System.out.println("2. 제품 등록");
			System.out.println("3. 제품 삭제");
			System.out.println("4. 제품 정보 변경");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴 번호를 입력해주세요.");
			int menuNum = 0;
			try {
				menuNum = s.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			} finally {
				s.nextLine();
			}
			switch (menuNum) {
			case 1:
				create();
				break;
			case 2:
				read();
				break;
			case 3:
				remove();
				break;
			case 4:
				update();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				s.close();
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	public void create() {
		System.out.print("제품등록할 제목을 입력해주세요.");
		String title = s.nextLine();
		System.out.print("등록할 제품의 가격을 입력해주세요.");
		int price = 0;
		try {
			price = s.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} finally {
			s.nextLine();
		}
		System.out.print("등록할 제품의 할인율을 입력해주세요.");
		int discount = 0;
		try {
			discount = s.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} finally {
			s.nextLine();
		}
		sc.create(title, price, discount);

	}

	public void read() {
		List<Shopping> list = sc.read();
		System.out.println("제품 정보를 조회하겠습니다.");

		if (!(list.isEmpty())) {
			for (Shopping s : list) {
				System.out.println("제목 :" + s.getTitle());
				System.out.println("가격 :" + s.getPrice());
				System.out.println("할인율 :" + s.getDiscount());
			}
		} 
		else {
				System.out.println("등록된 제품이 없습니다.");
		}
	}

	public void remove() {
		System.out.println("등록하신 제품을 삭제하겠습니다.");
		read();
		System.out.println("삭제하실 제품의 이름을 입력해주세요.");
		String title = s.nextLine();
		if("".equals(title)||title.isEmpty()||title.isBlank()) {
			System.out.println("잘못 입력하셨습니다.");
			sc.remove(title);
		}
		read();
		System.out.println("삭제 되었습니다.");
	}
	public void update() {
		System.out.print("변경하실 제품의 이름을 입력하세요.>");
		String title = s.nextLine();
		System.out.print("변경하실 가격의 이름을 입력하세요.>");
		int newPrice = 0;
		try {
			newPrice = s.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자를 입력해주세요.");
		}finally {
			s.nextLine();
		}
		try{
			sc.update(title, newPrice);
			System.out.println("제품을 찾을 수 없습니다.");
		}catch(ShoppingNotFoundException e) {
			System.out.println("제품이 변경되었습니다.");
		}
	}

}
