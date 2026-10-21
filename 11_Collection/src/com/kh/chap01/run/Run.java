package com.kh.chap01.run;

import com.kh.chap01.Integers;

public class Run {

	public static void main(String[] args) {

		//int[] nums = new int[50000];
		Integers i = new Integers();
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(10);
		
		System.out.println(i);
		
		System.out.println(i.get(3));
		
	}

}
