package com.kh.part.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.part.controller.PartTimeController;
import com.kh.part.exception.DuplicateNameException;
import com.kh.part.exception.InvalidPaymentException;
import com.kh.part.exception.PartTimeNotFoundException;
import com.kh.part.model.dto.PartTime;

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
				findByDate();
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
		System.out.println("알바 내역을 조회합니다.");
		List<PartTime> partTimes = pc.read();
	
		if (partTimes.isEmpty()) {
			System.out.println("알바 내역이 없습니다.");
		} else {
			for (PartTime p : partTimes) {
				System.out.println("알바 장소: " + p.getLocation());
				System.out.println("알바 시간: " + p.getTime());
				System.out.println("알바 시급: " + p.getPayment());
				System.out.println("알바 요일: " + p.getDate());
			}
		}
	}

	public void save() {
		System.out.print("알바 장소를 입력하세요.");
		String location = sc.nextLine();
		System.out.print("알바 시간을 입력해주세요.");
		int time = 0;
		try {
			time = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해주세요.");
		}finally {
			sc.nextLine();
		}
		System.out.print("알바 시급을 입력해주세요.");
		int payment = 0;
		try {
			payment = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해주세요.");
		}finally {
			sc.nextLine();
		}
		System.out.println("알바 요일을 입력해주세요."	);
		String date = sc.nextLine();
		
		try {
			pc.save(location, time, payment, date);
		}catch(DuplicateNameException e) {
			System.out.println(e.getMessage());
		}catch(InvalidPaymentException e) {
			System.out.println(e.getMessage());
		}
	}

	public void delete() {
		System.out.print("삭제하실 알바 장소를 입력해주세요.");
		String name = sc.nextLine();
		pc.delete(name);
		System.out.println("삭제 완료되었습니다.");
	}

	public void findByDate() {
		System.out.print("검색하실 요일을 입력해주세요.");
		String date = sc.nextLine();
		List<PartTime> searched = pc.findByDate(date);

		if(searched.isEmpty()) {
			System.out.println("검색하신 요일의 알바가 없습니다.");
			return;
		}
		for (PartTime p : searched) {
			System.out.println(p.getDate() + "의 알바는 " + p.getLocation() + " 이(가) 있습니다.");
		}
		
	
	}

	public void updateTime() {
		System.out.print("변경하실 알바 장소를 입력해주세요.");
		String location = sc.nextLine();
		System.out.print("변경하실 알바 시간을 입력해주세요.");
		int NewTime = 0;
		try {
			NewTime = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해주세요.");
		}finally {
			sc.nextLine();
		}
		try {
			pc.update(location, NewTime);
			System.out.println("변경이 완료되었습니다.");
			
		}catch(PartTimeNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
