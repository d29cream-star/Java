package com.kh.part.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.part.controller.PartTimeController;

public class PartTimeView {

	private Scanner sc = new Scanner(System.in);
	private PartTimeController pc = new PartTimeController();

	public void mainMenu() {
		while (true) {
			System.out.println("알바기록일지");
			System.out.println("메뉴선택");
			System.out.println("1. 알바 조회");
			System.out.println("2. 알바 저장");
			System.out.println("3. 알바 삭제");
			System.out.println("4. 알바 검색");
			System.out.println("5. 알바 수정");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호를 입력해주세요.>");
			int menuNum = 0;
			try {
				menuNum = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			} finally {
				sc.nextLine();
			}
			switch (menuNum) {
			case 1:
				read();
				break;
			case 2:
				save();
				break;
			case 3:
				delete();
				break;
			case 4:
				findByLocation();
				break;
			case 5:
				updateTime();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				return;
			}

		}
	}

	public void read() {
		
	}
	public void save() {
	
	}
	public void delete() {
		
	}
	public void findByLocation() {
		
	}
	public void updateTime() {
		
	}
}
