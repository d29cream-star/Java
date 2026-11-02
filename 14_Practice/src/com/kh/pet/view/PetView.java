package com.kh.pet.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.pet.controller.PetController;
import com.kh.pet.exception.DuplicatePetIDException;
import com.kh.pet.exception.InvalidPetAgeException;
import com.kh.pet.exception.PetNotFoundException;
import com.kh.pet.model.dto.Pet;

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
		List<Pet> pets = pc.read();
		if(!pets.isEmpty()) {
			for(Pet p : pets) {
				System.out.println("동물 ID : " + p.getPetID());
				System.out.println("동물 이름: " + p.getPetName());
				System.out.println("동물 나이: " + p.getPetAge());
				System.out.println("보호자 폰번호 :" + p.getOwnerPhone());
			}
		}else {
			System.out.println("등록된 동물이 없습니다.");
		}
	}
	public void save() {
		System.out.print("동물 ID를 입력해주세요.");
		String petID = sc.nextLine();
		
		System.out.print("동물 이름을 입력해주세요.");
		String petName = sc.nextLine();
		
		System.out.print("동물 나이를 입력해주세요.");
		int petAge = 0;
		try {
			petAge = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해주세요.");
		}finally{
			sc.nextLine();
		}
		System.out.print("보호자 폰 번호를 입력해주세요.");
		String ownerPhone = sc.nextLine();
		
		try {
			pc.save(petID, petName, petAge, ownerPhone);
		}catch(DuplicatePetIDException e) {
			System.out.println(e.getMessage());
		}catch(InvalidPetAgeException e) {
			System.out.println(e.getMessage());
		}
	}
	public void delete() {
		System.out.print("삭제하실 동물ID를 입력해주세요.")	;
		String petName = sc.nextLine();
		if(petName.isBlank()) {
			System.out.println("동물 ID를 입력하지 않으셨습니다.");
			return;
		}
		try {
			pc.delete(petName);
			System.out.println("삭제 완료되었습니다.");
		}catch(PetNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	public void findByOwnerPhone() {
		System.out.print("검색하실 보호자 폰번호를 입력하세요.");
		String ownerPhone = sc.nextLine();
		List<Pet> pets = pc.findByOwnerPhone(ownerPhone);
		if(pets.isEmpty()) {
			System.out.println("검색하신 동물이 없습니다.");
			return;
		}else {
			for(Pet p : pets) {
				System.out.println(p.getOwnerPhone() + " 님의 동물은 " + p.getPetName() + "입니다.");
			}
		}
	}
	public void update() {
		System.out.print("등록하신 동물 ID를 입력해주세요.");
		String petID = sc.nextLine();
		System.out.print("변경하실 동물의 나이를 입력해주세요.");
		int newPetAge = 0;
		
		try {
			newPetAge = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해주세요.");
		}finally {
			sc.nextLine();
		}try {
			pc.update(petID, newPetAge);
			System.out.println("변경이 완료되었습니다.");
		}catch(PetNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
