package com.kh.chap02.run;

import java.util.ArrayList;

import com.kh.chap02.model.Box;
import com.kh.chap02.model.dto.Mall;

public class GenericRun {

	public static void main(String[] args) {

		/*
		 * ArrayList list = new ArrayList(); list.add("하이"); list.add(1);
		 * list.add(true);
		 * 
		 * String text = (String)list.get(0); int number = (int)list.get(1);
		 */

		Box box = new Box();
		box.set(1);
		box.set("하하");
		box.set(new Mall("스타필드", "고양"));

		Box<String> b = new Box();
		b.set("타입");
		// b.set(123123);

		Box<Mall> m = new Box();
		m.set(new Mall("스타필드", "하남"));
		// m.set("이건 안됨");

		Mall e = m.get();

		ArrayList<Mall> malls = new ArrayList();
		malls.add(new Mall("스타필드", "하남"));
		// Mall mall = malls.get(0);

		// for(Mall mall : malls) {
		// System.out.println(((Mall)mall).getBrand());

		for (Mall mall : malls) {
			System.out.println(mall.getBrand());

		//ArrayList<Mall> malls = new ArrayList<Mall>(); //양쪽에 넣어주는게 원칙(구버전)

			
			
		}
	}
}
