package com.kh.chap02.run;

import com.kh.chap02.model.dto.Bracelet;
import com.kh.chap02.model.dto.PrinceGoldCrown;
import com.kh.chap02.model.dto.SwedenGoldCrown;

public class Run {

	public static void main(String[] args) {

		PrinceGoldCrown pgc = new PrinceGoldCrown();
		pgc.setName("금령총 금관");
		System.out.println(pgc.getName());

		SwedenGoldCrown sgc = new SwedenGoldCrown("서봉총 금관", 8.0, 8);
		System.out.println(sgc.info());

		Bracelet b = new Bracelet("팔찌", 120.0, 12.0);
		System.out.println(b.info());
	}

	
}
