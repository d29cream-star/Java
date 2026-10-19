package com.kh.chap04.model.service;

import com.kh.chap04.model.dto.GimBab;

public class ExpensiveFilter implements GimBabFilter{

	@Override
	public boolean filter(GimBab g) {
		return g.getPrice()>= 2000;
	}
	
}
