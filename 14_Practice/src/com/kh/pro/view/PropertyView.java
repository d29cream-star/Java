package com.kh.pro.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.pro.controller.PropertyController;
import com.kh.pro.exception.DuplicateNameException;
import com.kh.pro.model.dto.Property;

public class PropertyView {

	private Scanner sc = new Scanner(System.in);
	private PropertyController pc = new PropertyController();

	public void mainMenu() {
		while (true) {
			System.out.println("중고매물 사이트");
			System.out.println("메뉴 선택");
			System.out.println("1. 중고 매물 조회");
			System.out.println("2. 중고 매물 등록");
			System.out.println("3. 중고 매물 삭제");
			System.out.println("4. 중고 매물 검색");
			System.out.println("5. 중고 매물 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println();
			System.out.print("메뉴를 선택하세요.>");
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
				update();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");

			}
		}
	}

	public void read() {
		List<Property> list = pc.read();
		if (!list.isEmpty()) {
			for (Property p : list) {
				System.out.println("상품명 : " + p.getName());
				System.out.println("가격 : " + p.getPrice());
				System.out.println("상태 : " + p.getGrade());
				System.out.println("거래지역 :" + p.getLocation());
			}

		} else {
			System.out.println("등록된 상품이 없습니다.");
		}

	}

	public void save() {
		System.out.print("등록할 상품명을 입력하세요.>");
		String name =sc.nextLine();
		System.out.print("등록할 상품의 가격을 입력하세요.>");
		int price = 0;
		try {
			price = sc.nextInt();
		}catch(InputMismatchException e) {
			e.getMessage();
		}finally {
			sc.nextLine();
		}
		System.out.print("등록할 상품의 상태를 입력하세요.>");
		String grade = sc.nextLine();
		System.out.print("등록할 상품의 거래지역을 입력하세요.>");
		String location = sc.nextLine();
		
		try {
			pc.save(name, price, grade, location);
		}catch(DuplicateNameException e) {
			e.getMessage();
		}
		
	}

	public void delete() {
		System.out.print("삭제하실 상품명을 입력해주세요.");
		String name = sc.nextLine();
		if(name.isBlank()) {
			System.out.println("일치하는 상품이 없습니다.");
		}else {
			pc.delete(name);
			System.out.println("삭제가 완료되었습니다.");
		}
	}

	public void findByLocation() {
		System.out.print("검색하시고 싶은 지역명을 입력해주세요.");
		String location = sc.nextLine();
		
		List<Property> list = pc.findByLocation(location);
		if(list.isEmpty()) {
			System.out.println("상품이 존재하지 않습니다.");
			return;
		}
	
	}

	public void update() {

	}
}
