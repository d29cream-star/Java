package mvcpractice02;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NewsView {

	private Scanner sc = new Scanner(System.in);
	private NewsController nc = new NewsController();

	public void mainMenu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1. 기사 등록");
		System.out.println("2. 기사 조회");
		System.out.println("3. 기사 수정");
		System.out.println("4. 기사 삭제");
		System.out.println("5. 프로그램 종료");

		while (true) {
			System.out.print("메뉴를 선택하세요.>");
			int menuNum = 0;
			try {
				menuNum = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");

			} finally {
				sc.nextLine();
			}

			switch (menuNum) {
			case 1:
				create();
				break;
			case 2:
				read();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			default:
				System.out.println("없는 메뉴를 선택하셨습니다.");
			}
		}
	}

	public void create() {
		System.out.print("기사 제목을 입력해주세요.");
		String name = sc.nextLine();

		System.out.print("신문사를 입력해주세요.");
		String publisher = sc.nextLine();

		nc.create(name, publisher);
		System.out.println("개재가 완료되었습니다.");

	}

	public void read() {
		List<News> list = nc.read();
		System.out.println("기사 목록을 확인하세요.");
		if (!list.isEmpty()) {
			for (News n : list) {
				System.out.println(n.getName() + " " + n.getPublisher());
			}

		} else {
			System.out.println("등록된 기사가 없습니다.");

		}
	}

	public void update() {
		System.out.print("수정하실 기사 제목을 입력하세요>");
		String name = sc.nextLine();
		System.out.print("변경된 기사 제목을 입력하세요>");
		String updateName = sc.nextLine();
		System.out.print("변경된 신문사를 입력하세요.");
		String publisher = sc.nextLine();
		nc.update(name, updateName, publisher);

	}

	public void delete() {
		System.out.println("기사를 삭제하겠습니다.");
		read();
		System.out.print("삭제하실 기사 제목을 입력해주세요.>");
		String name = sc.nextLine();
		nc.delete(name);
	}
}
