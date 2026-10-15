package com.kh.chap03.model.dto;

public class Coffee extends Beverage{
	private boolean caffeine;

	public Coffee() {
	}

	public Coffee(String name, String volume, String color, boolean caffeine) {
		super(name, volume, color);
		this.caffeine = caffeine;
	}

	public boolean isCaffeine() {
		return caffeine;
	}

	public void setCaffeine(boolean caffeine) {
		this.caffeine = caffeine;
	}
	public String info(){
		return super.info()+ " 카페인유무:" + caffeine;
	}
	
}

