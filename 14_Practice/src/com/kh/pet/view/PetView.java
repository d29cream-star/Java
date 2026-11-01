package com.kh.pet.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.pet.controller.PetController;

public class PetView {

	private Scanner sc = new Scanner(System.in);
	private PetController pc = new PetController();
	
	
	public void mainMenu() {
		while(true) {
			System.out.println("반려동물 관리 프로그램");
			System.out.println("메뉴");
			System.out.println("1. 동물 조회");
			System.out.println("2. 동물 등록");
			System.out.println("3. 동물 삭제");
			System.out.println("4. 동물 검색");
			System.out.println("5. 동물 수정");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호를 입력해주세요.");
			int menuNum = 0;
			try {
				menuNum = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			}finally {
				sc.nextLine();
			}
			switch(menuNum) {
			case 1 : read(); break;
			case 2 : save(); break;
			case 3 : delete(); break;
			case 4 : findByOwnerPhone(); break;
			case 5 : update(); break;
			case 0 : System.out.println("프로그램을 종료합니다.");
			sc.close(); return;
			default: System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public void read() {
		System.out.println("동물 정보를 조회합니다.");
		
		
		pc.read();
			
		}
	}
}
