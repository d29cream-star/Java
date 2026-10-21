package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.Arrays;

import com.kh.chap02.model.dto.Mall;

public class Run {

	public static void main(String[] args) {

		Mall[] m = new Mall[3];
		ArrayList malls = new ArrayList();
		System.out.println(m);
		System.out.println(malls);
		
		m[0] = new Mall("스타필드 ", "하남");
		m[1] = new Mall("스타필트 ", "고양");
		m[2] = new Mall("스타필트 ", "안성");
		//m[3] = new Mall("더현대", "여의도");
		System.out.println(Arrays.toString(m));
		
		malls.add(new Mall("스타필드", "고양"));
		malls.add(new Mall("스타필드", "하남"));
		malls.add(new Mall("스타필드", "안성"));
		malls.add(new Mall("더현대", "여의도"));
		System.out.println(malls);
		
		malls.add(0, new Mall("롯데백화점", "소공동"));
		System.out.println(malls);
		
		malls.set(0, new Mall("신세계백화점","회현동"));
		System.out.println(malls);
		
		malls.remove(0);
		System.out.println(malls);
		
	}

}
