package com.kh.diary.controller;

import com.kh.diary.dto.Diary;
import com.kh.diary.exception.DiaryBoomException;

public class DiaryController {

	private Diary d;

	public void decoDiary(String logo, String title, String signature) {

		Diary diary = new Diary(logo, title, signature);
		d = diary; // 아 this는 꼭 안써도 되는구나!

	}

	public Diary getD() {
		return d;

	}

	public void boom() {
		int rand = (int) (Math.random() * 100) + 1;

		if (rand < 11) {
			d = null;
			throw new DiaryBoomException("다이어리가 폭발했습니다.	");
		}
	}

}
