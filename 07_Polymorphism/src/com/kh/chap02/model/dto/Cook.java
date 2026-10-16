package com.kh.chap02.model.dto;

public abstract class Cook {

	private String name;

	public Cook(String name) {
		this.name = name;
	}

	//public void cooking() {	}
	public abstract void cooking();
	
	
	public void breakTime() {
		System.out.println("쉬는시간");
	}
	
	
}
