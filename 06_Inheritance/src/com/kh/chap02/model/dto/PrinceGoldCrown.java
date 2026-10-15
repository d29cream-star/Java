package com.kh.chap02.model.dto;

public class PrinceGoldCrown extends Treasure {

	private String source;

	public PrinceGoldCrown() {
		System.out.println("자식");
	}

	public PrinceGoldCrown(String source) {
		this.source = source;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	
}
