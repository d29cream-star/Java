package com.kh.diary.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.diary.controller.DiaryController;

public class DiaryView {

	private Scanner sc = new Scanner(System.in);
	private DiaryController dc = new DiaryController();

	public void mainMenu() {
		System.out.println("😂😐😏다꾸다꾸😥🎶🤣");
		while (true) {
			System.out.println("메뉴 선택(●'◡'●)");
			System.out.println("1. 다이어리 꾸미기(❁´◡`❁)");
			System.out.println(" > ");
			int menuNo = 0;
			try {
				menuNo = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자 입력 ㄱㄱ");
				continue;
			} finally {
				sc.nextLine();
			}
			switch (menuNo) {

			}

		}
	}

}
