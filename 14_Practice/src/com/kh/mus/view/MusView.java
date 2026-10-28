package com.kh.mus.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.mus.controller.MusController;
import com.kh.mus.exception.MusicNotFoundException;
import com.kh.mus.model.dto.Music;

public class MusView {

	private Scanner sc = new Scanner(System.in);
	private MusController mc = new MusController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("뮤직 플레이리스트");
			System.out.println("메뉴선택");
			System.out.println("1. 전체조회");
			System.out.println("2. 음악추가");
			System.out.println("3. 음악삭제");
			System.out.println("4. 음악검색");
			System.out.println("5. 음악수정");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호를 입력해주세요.");
			int menuNum = 0;
			try {
				menuNum = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			}finally{
				sc.nextLine();
			}
			switch(menuNum) {
			case 1 : read();break;
			case 2 : save();break;
			case 3 : delete();break;
			case 4 : findByGenre();break;
			case 5 : update();break;
			case 0 : System.out.println("프로그램을 종료합니다.");
			default: System.out.println("잘못 입력하셨습니다.");
			return;
			}
		}
	}
	public void read() {
		System.out.println("음악을 조회합니다.");
		List<Music> musics = mc.read();
		if(!musics.isEmpty()) {
				for(Music m : musics) {
					System.out.println("음악 제목 : ");
					System.out.println("가수 : ");
					System.out.println("재생 길이 : ");
					System.out.println("음악 장르 : ");
					
			}
		}else {
			System.out.println("등록하신 음악이 없습니다.");
		}
		
	}
	public void save() {
		System.out.print("음악 제목을 입력하세요.>");
		String name = sc.nextLine();
		System.out.print("가수 이름을 입력하세요.>");
		String singer = sc.nextLine();
		System.out.print("재생 길이를 입력하세요.>");
		int playtime = 0;
		try{
			playtime = sc.nextInt();
		}catch(InputMismatchException e) {
			e.getMessage();
		}finally {
			sc.nextLine();
		}System.out.print("음악 장르를 입력해주세요.");
		String genre = sc.nextLine();
		
		try {
			mc.save(name, singer, playtime, genre);
		}catch(MusicNotFoundException e) {
			e.getMessage();
		}
	}
	public void delete() {
		
	}
	public void findByGenre() {
		
	}
	public void update() {
		
	}
	
}
