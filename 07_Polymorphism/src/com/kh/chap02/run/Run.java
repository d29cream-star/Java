package com.kh.chap02.run;

import com.kh.chap02.model.factory.CookFactory;
import com.kh.chap02.model.fried.Fried;

public class Run {

	public static void main(String[] args) {

//		Main m = new Main("조규철");
//		m.cooking();
//		
//		Salad s = new Salad("이승철");
//		s.cooking(); // 기존에 배운 방법
//	
//		Cook c = new Cook("요리사");// 객체생성 불가능
//		c.cooking();
//		
//		Cook[] c = {m, s, new Event("이벤트")}; // 다형성 적용
//		for (int i = 0 ; i<c.length; i++) {
//			[i].cooking();
//		}
//		
	/*	JjamBbong jb = new JjamBbong();
		jb.makeJjamBbong();
		
		Jajang jj = new Jajang();
		jj.makeJajang();
	
		//타입 은닉
		
		Fried f = new FriedRice();
		f.fried();
		
		f = new FriedPork();
		f.fried();*/
		
		CookFactory cf = new CookFactory();
		Fried f = cf. create();
		f.fried();
		
		
	}
}