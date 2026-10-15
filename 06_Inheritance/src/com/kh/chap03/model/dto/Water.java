package com.kh.chap03.model.dto;

public class Water extends Beverage{

	private String source;

	
	public Water() {
	}

	public Water(String name, String volume, String color, String source) {
		super(name, volume, color);
		this.source = source;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	public String info() {
		return super.info() + " 수원지 : " + source;
	}
	
	
	
}
