package com.kh.chap04.model.service;

import com.kh.chap04.model.dto.GimBab;

public class PorkFilter implements GimBabFilter{

	@Override
	public boolean filter(GimBab g) {
		return g.getMainMenu().contains("제육");
	}
}
