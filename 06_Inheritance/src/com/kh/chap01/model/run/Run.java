package com.kh.chap01.model.run;

import com.kh.chap01.model.dto.GoldBracelet;
import com.kh.chap01.model.dto.PrinceTombGoldCrown;
import com.kh.chap01.model.dto.SwedenTombGoldCrown;

public class Run {

	public static void main(String[] args) {

		GoldBracelet gb = new GoldBracelet("경주 금팔지", 216, 8.3);
		SwedenTombGoldCrown st = new SwedenTombGoldCrown("서봉총 금관", 0.8, 80);
		PrinceTombGoldCrown pt = new PrinceTombGoldCrown("금령총 금관", 27, "신라");

		System.out.println(gb.info());
		System.out.println(st.info());
		System.out.println(pt.info());
	
		
	
		
	}

}
