package com.kh.pet.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.pet.controller.PetController;
import com.kh.pet.exception.DuplicatePetIDException;
import com.kh.pet.exception.InvalidPetAgeException;
import com.kh.pet.model.dto.Pet;

public class PetView {

	private Scanner sc = new Scanner(System.in);
	private PetController pc = new PetController();

	public void mainMenu() {
		while (true) {
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
				findByOwnerPhone();
				break;
			case 5:
				update();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	public void read() {
		List<Pet> pets = pc.read();
		System.out.println("동물 정보를 조회합니다.");
		if (pets.isEmpty()) {
			System.out.println("조회된 정보가 없습니다.");
		} else {
			for (Pet p : pets) {
				System.out.println("동물 ID : " + p.getPetID());
				System.out.println("동물 이름 : " + p.getPetName());
				System.out.println("동물 나이 : " + p.getPetAge());
				System.out.println("보호자 번호 :" + p.getOwnerPhone());
			}
		}
	}

	public void save() {
		System.out.print("등록하실 동물 ID를 입력하세요.");
		String petID = sc.nextLine();
		System.out.print("등록하실 동물의 이름을 입력하세요.");
		String petName = sc.nextLine();
		System.out.print("등록하실 동물의 나이를 입력하세요.");
		int petAge = 0;
		try {
			petAge = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
		}
		System.out.print("등록하실 보호자의 폰번호를 입력하세요.");
		String ownerPhone = sc.nextLine();

		try {
			pc.save(petID, petName, petAge, ownerPhone);
		} catch (DuplicatePetIDException e) {
			System.out.println(e.getMessage());
		} catch (InvalidPetAgeException e) {
			System.out.println(e.getMessage());
		}
	}
	public void delete() {
		System.out.print("삭제하실 동물 ID를 입력해주세요.");
		String petID = sc.nextLine();
		List<Pet> pets = pc.delete(petID);
		
		if(pets.isEmpty()) {
			System.out.println("삭제하실 동물 ID가 없습니다.");
		} else {
			System.out.println("삭제되었습니다.");
		}
		
	}
	public void findByOwnerPhone() {
		System.out.print("보호자의 폰번호를 입력하세요.");
		String ownerPhone = sc.nextLine();
	}
}
