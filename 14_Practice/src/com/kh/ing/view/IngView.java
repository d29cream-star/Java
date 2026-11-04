package com.kh.ing.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.ing.controller.IngController;
import com.kh.ing.exception.DuplicateIdException;
import com.kh.ing.exception.InvalidQuantityException;
import com.kh.ing.model.dto.Ingredient;

public class IngView {

	private Scanner sc = new Scanner(System.in);
	private IngController ic = new IngController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("식료품 정리 시스템");
			System.out.println("메뉴");
			System.out.println("1. 식료품 조회");
			System.out.println("2. 식료품 저장");
			System.out.println("3. 식료품 삭제");
			System.out.println("4. 식료품 검색");
			System.out.println("5. 식료품 수정");
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
			case 4 : findByLocation(); break;
			case 5 : update(); break;
			case 0 : System.out.println("프로그램을 종료합니다.");
					sc.close(); return;
			default: System.out.println("잘못 입력하셨습니다.");
			
			}
		}
	}
	public void read() {
		List<Ingredient> ingredients = ic.read();
		if(!(ingredients.isEmpty())) {
			for(Ingredient ig : ingredients) {
				System.out.println("식료품 ID : " + ig.getIngredientId());
				System.out.println("식료품 이름 : " + ig.getName());
				System.out.println("식료품 양 : " + ig.getQuantity());
				System.out.println("식료품 보관 : " + ig.getStorageLocation());
				System.out.println("식료품 소비기한 : " + ig.getUseByDate());
			}
		}else {
			System.out.println("등록된 식료품이 없습니다.");
		}
	}
	public void save() {
		System.out.print("등록하실 식료품 ID를 입력해주세요.");
		int ingredientId = 0;
		try{
			ingredientId = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해주세요.");
		}
		System.out.print("등록하실 식료품 이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.print("등록하실 식료품의 양을 입력해주세요.");
		int quantity = 0;
		
		try {
			quantity = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해주세요.");
		}
		System.out.print("등록하실 식료품의 보관 장소를 입력해주세요 (실온, 냉장, 냉동)");
		String storageLocation = sc.nextLine();
		System.out.print("등록하실 식료품의 소비기한을 입력해주세요");
		String useByDate = sc.nextLine();
		
		try {
			ic.save(ingredientId, name, quantity, storageLocation, useByDate);
		}catch(DuplicateIdException e) {
			System.out.println(e.getMessage());
		}catch(InvalidQuantityException e) {
			System.out.println(e.getMessage());
		}
	}
	public void delete() {
		System.out.print("삭제하실 제품의 이름을 입력해주세요.");
		String name = sc.nextLine();
		if(name.isBlank()) {
			System.out.println("제품의 이름을 입력해주세요.");
		}
		for(Ingredient ig : ingredients) {
			
			System.out.println("제품이 삭제되었습니다.");
		}
	}
	public void findByLocation() {
		
	}
}
