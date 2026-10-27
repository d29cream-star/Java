package com.kh.exc.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.exc.controller.ExcerciseController;
import com.kh.exc.exception.DuplicateNameException;
import com.kh.exc.exception.ExcerciseNotFoundException;
import com.kh.exc.model.dto.Excercise;

public class ExcerciseView {

	private Scanner sc = new Scanner(System.in);
	private ExcerciseController ec = new ExcerciseController();
	
	
	public void mainMenu() {
		while(true) {
			System.out.println();
			System.out.println("운동기록장입니다.");
			System.out.println("메뉴");
			System.out.println("1. 운동기구 조회하기");
			System.out.println("2. 운동기구 저장하기");
			System.out.println("3. 운동기구 삭제하기");
			System.out.println("4. 운동기구 검색하기");
			System.out.println("5. 운동기구 무게 수정하기");
			System.out.println("6. 프로그램 종료");
			System.out.print("메뉴를 선택해주세요.>");
			System.out.println();
			
			int menuNum = 0;
			try {
				menuNum = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			}finally {
				sc.nextLine();
			}
			switch(menuNum) {
			case 1 : read();break;
			case 2 : save();break;
			case 3 : remove();break;
			case 4 : findByTarget();break;
			case 5 : updateWeight();break;
			case 6 : 
				System.out.println("프로그램을 종료합니다.");
				sc.close();return;
			default: System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public void read() {
		List<Excercise> list = ec.read();
		
		if(!list.isEmpty()) {
			System.out.println("운동 전체를 조회했습니다.");
			for(Excercise e : list) {
		
			System.out.println("운동 이름 :"  + e.getName() );
			System.out.println("무게 : " + e.getWeight());
			System.out.println("횟수 : " + e.getCount());
			System.out.println("운동 부위 : " + e.getTarget());
			}
		}else {
			System.out.println("없는 운동입니다.");
		}
		
	}
	public void save() {
		System.out.print("등록하실 운동이름을 입력해주세요.>");
		String name = sc.nextLine();
		System.out.print("운동의 무게를 입력하세요(kg)>");
		int weight = 0;
		try {
			weight = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.print("숫자를 입력해주세요.");
		}finally {
			sc.nextLine();	
		}System.out.print("운동의 횟수를 입력하세요(회)>");
		int count = 0;
		try {
			count = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.print("숫자를 입력해주세요.");
		}finally {
			sc.nextLine();
		}
		System.out.print("운동 부위를 입력해주세요.>");
		String target = sc.nextLine();
		
		try{
			ec.save(name, weight, count, target);
			System.out.println("운동이 등록되었습니다.");
		}catch(DuplicateNameException e) {
			System.out.println(e.getMessage());
			System.out.println("다른 운동명을 입력해주세요.");
	}
	}
	public void remove() {
		System.out.println("운동을 삭제하겠습니다.");
		System.out.print("삭제하실 운동명을 입력해주세요>");
		String name = sc.nextLine();
		if(name.isBlank()) {
			System.out.println("운동명을 입력해주세요.");
		}else {
			ec.remove(name);
			System.out.println("삭제 완료되었습니다.");
		}
	}
	public void findByTarget() {
		System.out.print("검색할 부위를 입력해주세요.>");
		String target = sc.nextLine();
		
		List<Excercise> searched = ec.findByTarget(target);
		
		if(searched.isEmpty()) {
			System.out.println("조회할 운동이 없습니다.");
			return;
		}
			System.out.println("부위에 따른 운동은 아래와 같습니다.");
		for(Excercise e : searched) {
					System.out.println(target + " 부위의 운동은 " + e.getName()  + " 이 있습니다."	);
				}
			}
	
	public void updateWeight() {
		System.out.print("변경하실 운동명을 입력해주세요.>");
		String name = sc.nextLine();
		System.out.print("변경하실 운동의 무게를 입력해주세요.>");
		int newWeight = 0;
		try {
			newWeight = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해주세요.");
		}finally {
			sc.nextLine();
		}
		try{
			ec.updateWeight(name, newWeight);
			System.out.println(name + " 가 " + newWeight + "원으로 변경되었습니다.");
		
		}catch(ExcerciseNotFoundException e) {
			System.out.println(e.getMessage());
		}
	
	}
}
