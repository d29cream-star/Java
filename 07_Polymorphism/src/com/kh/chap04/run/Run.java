package com.kh.chap04.run;

import com.kh.chap04.model.dto.GimBab;
import com.kh.chap04.model.service.ExpensiveFilter;
import com.kh.chap04.model.service.GimBabFilter;
import com.kh.chap04.model.service.PorkFilter;

public class Run {

	public static void main(String[] args) {

		GimBab[] gimbabs = { new GimBab("날치알마리", "날치알", 1000), new GimBab("제육김치마리", "제육", 1500),
				new GimBab("간장삼겹마리", "삼겹", 2000), new GimBab("햄치즈마리", "햄", 1000), new GimBab("불닭마리", "닭고기", 2000),
				new GimBab("땡초마리", "땡초", 1500), new GimBab("종합마리", "제육,닭고기,땡초", 3000) };

		GimBabFilter filter = new ExpensiveFilter();

		for (int i = 0; i < gimbabs.length; i++) {
			if (filter.filter(gimbabs[i])) {
				System.out.println(gimbabs[i].getName());
			}
		}

		for (GimBab b : gimbabs) {
			if (filter.filter(b)) {
				System.out.println(b.getName());
			}
		}

		GimBabFilter f = new PorkFilter();
		for (GimBab b : gimbabs) {
			if (f.filter(b)) {
				System.out.println("제육이 포함된 김밥: " + b.getName());
			}
		}

		GimBabFilter cheapFilter = new GimBabFilter() { // 여기까지 원래 객체생성을 못해서 안됨 근데, {override 해서 바로 작성}
			@Override
			public boolean filter(GimBab b) {
				return b.getPrice() <= 1500;
			}
		};
		for (GimBab b : gimbabs) {
			if (cheapFilter.filter(b)) {
				System.out.println("1500원보다 저렴한 김밥: " + b.getName());
			}
		}

		GimBabFilter chiFilter = new GimBabFilter() {
			@Override
			public boolean filter(GimBab g) {
				return g.getName().contains("치");
			}
		};

		for (GimBab b : gimbabs) {
			if (chiFilter.filter(b)) {
				System.out.println("치가 포함된 김밥: " + b.getName());
			}
		}
		GimBabFilter filter2 = (GimBab g) -> {
			return g.getName().contains("치");
		};

		for (GimBab b : gimbabs) {
			if (filter2.filter(b)) {
				System.out.println("치가 포함된 김밥: " + b.getName());
			}
		}
		GimBabFilter filter3 = g -> {
			return g.getName().contains("치");
		};

		for (GimBab b : gimbabs) {
			if (filter3.filter(b)) {
				System.out.println("치가 포함된 김밥: " + b.getName());
			}
		}

		GimBabFilter filter4 = g -> g.getName().contains("치");

		for (GimBab b : gimbabs) {
			if (filter4.filter(b)) {
				System.out.println("치가 포함된 김밥: " + b.getName());
			}
		}
	}
}
