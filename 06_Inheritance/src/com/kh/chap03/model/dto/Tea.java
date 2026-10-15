package com.kh.chap03.model.dto;

public class Tea extends Beverage {

	private String type;

	public Tea() {
	}

	public Tea(String name, String volume, String color,String type) {
		super(name, volume, color);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String info() {
		return super.info() + " 종류 : " + type;
	}
}
