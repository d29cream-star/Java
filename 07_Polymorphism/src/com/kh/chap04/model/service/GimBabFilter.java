package com.kh.chap04.model.service;

import com.kh.chap04.model.dto.GimBab;

@FunctionalInterface
public interface GimBabFilter {
	
	boolean filter(GimBab g);
	
	
}
