package com.kh.chap03.run;

import com.kh.chap03.model.dto.Beverage;
import com.kh.chap03.model.dto.Coffee;
import com.kh.chap03.model.dto.Juice;
import com.kh.chap03.model.dto.Tea;
import com.kh.chap03.model.dto.Water;

public class Run {

	public static void main(String[] args) {
		Beverage b = new Beverage("아메리카노", "500", "색깔");
		System.out.println(b.info());
		Coffee c = new Coffee("아메리카노", "500", "갈색", true);
		System.out.println(c.info());
		Tea t = new Tea("차", "500ml", "녹색", "녹차");
		System.out.println(t.info());
		Water w = new Water("물", "500ml", "투명","제주도");
		System.out.println(w.info());

		System.out.println(b);
		System.out.println(b.toString());

		System.out.println(c);
		System.out.println(w);
	
		System.out.println("-----------------");
		
		Juice j = new Juice();
		System.out.println(j);
	}
	
}
