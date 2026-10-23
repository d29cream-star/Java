package com.kh.khworld.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.khworld.controller.KhWorldController;
import com.kh.khworld.exception.DuplicateNameException;
import com.kh.khworld.model.dto.Attraction;

public class KhWorldView {

	private Scanner sc = new Scanner(System.in);
	private KhWorldController kc = new KhWorldController();

	public void mainMenu() {
		while (true) {
			System.out.println();
			System.out.println("놀이기구 관리 프로그램입니다.");
			System.out.println("1. 놀이기구 전체 조회하기");
			System.out.println("2. 놀이기구 추가하기");
			System.out.println("3. 놀이기구 삭제하기");
			System.out.println("4. 놀이기구 검색하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.println();
			System.out.print("사용하실 메뉴 번호를 입력해주세요>");
			int menu = 0;

			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			} finally {
				sc.nextLine();
			}
			switch (menu) {
			case 1:
				readAttractions();
				break;
			case 2:
				save();
				break;
			case 3:
				deleteAttractions();
				break;
			case 4:
				findByName();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			default:
				System.out.println("없는 메뉴를 선택하셨습니다.");
			}
		}
	}

	public void readAttractions() {
		List<Attraction> list = kc.readAttraction();

		// list.size != 0
		if (!list.isEmpty()) {
			System.out.println();
			System.out.println("놀이기구 정보를 확인하세요.");
			System.out.println();
			for (Attraction a : list) {
				System.out.println("놀이기구명 :" + a.getName());
				System.out.println("========================== ");
				System.out.println("키 제한 :" + a.getHeightLimit());
				System.out.println("========================== ");
				System.out.println("위치 : " + a.getLocation());
				System.out.println("========================== ");
				System.out.println();
			}
		} else {
			System.out.println("==========================");
			System.out.println("아직 놀이기구가 존재하지 않습니다.");
			System.out.println("==========================");
		}

	}

	public void save() {
		System.out.println();
		System.out.print("놀이기구의 이름을 입력해주세요.>");
		String name = sc.nextLine();
		System.out.print("키 제약사항을 입력해주세요.>");
		String heightLimit = sc.nextLine();
		System.out.print("위치를 입력해주세요.>");
		String location = sc.nextLine();
		try {
			kc.save(name, heightLimit, location);
			System.out.println("놀이기구가 등록되었습니다.");
		} catch (DuplicateNameException e) {
			System.out.println(e.getMessage());
			System.out.println("새로운 놀이기구를 작성해주세요.");
		}

	}
	public void deleteAttractions() {
		System.out.println();
		System.out.println("등록된 놀이기구를 제거하겠습니다.");
		readAttractions();
		
		System.out.print("삭제하실 놀이기구 이름을 입력해주세요.>");
		String name = sc.nextLine();
		
		if("".equals(name) || name.contains("바보") || name.length() <= 1 || name.isBlank() || name.isEmpty()) {
			System.out.println("올바르지 않은 놀이기구명입니다.");
			return;
		}
		
		kc.deleteAttractions(name);
		
	}
	private void findByName() {
		
		String keyword = sc.nextLine();
		
		List<Attraction> list= kc.readAttraction();
		
	}

}
