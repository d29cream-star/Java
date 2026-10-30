package com.kh.mus.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.mus.controller.MusController;
import com.kh.mus.exception.DuplicateNameException;
import com.kh.mus.exception.MusicNotFoundException;
import com.kh.mus.model.dto.Music;

public class MusView {

	private Scanner sc = new Scanner(System.in);
	private MusController mc = new MusController();

	public void mainMenu() {
		while (true) {
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
				findByGenre();
				break;
			case 5:
				update();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		}
	}

	public void read() {
		System.out.println("음악을 조회합니다.");
		List<Music> musics = mc.read();
		if (!musics.isEmpty()) {
			for (Music m : musics) {
				System.out.println("음악 제목 : ");
				System.out.println("가수 : ");
				System.out.println("재생 길이 : ");
				System.out.println("음악 장르 : ");

			}
		} else {
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
		try {
			playtime = sc.nextInt();
		} catch (InputMismatchException e) {
			e.getMessage();
		} finally {
			sc.nextLine();
		}
		System.out.print("음악 장르를 입력해주세요.");
		String genre = sc.nextLine();

		try {
			mc.save(name, singer, playtime, genre);
		} catch (DuplicateNameException e) {
			System.out.println(e.getMessage());
		}
	}

	public void delete() {
		System.out.print("삭제하실 음악 제목을 입력해주세요.>");
		String name = sc.nextLine();
		if(name.isBlank()) {
			System.out.println("음악제목을 입력해주세요.>");
		}else {
			mc.delete(name);
			System.out.println("삭제완료하였습니다.");
		}
	}

	public void findByGenre() {
		System.out.print("검색하실 장르를 입력해주세요.>");
		String genre = sc.nextLine();

		List<Music> musics = mc.findByGenre(genre);

		if (musics.isEmpty()) {
			System.out.println("검색하신 장르의 음악이 없습니다.");
	
		return;
		}
		System.out.println("검색하진 음악은 아래와 같습니다.");
		for (Music m : musics) {
			System.out.println(m.getGenre() + " 음악은" + m.getName() + "이(가) 있습니다.");
		}
	}

	public void update() {
		System.out.print("수정하실 음악 제목을 입력하세요.");
		String name = sc.nextLine();
		System.out.print("수정하실  음악의 재생길이를 입력하세요.");
		int newPlaytime = 0;
		try {
			newPlaytime = sc.nextInt();
		} catch (InputMismatchException e) {
			e.getMessage();
		} finally {
			sc.nextLine();
		}
		try{
			mc.update(name, newPlaytime);
			System.out.println("수정이 완료되었습니다.");
		}catch(MusicNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
