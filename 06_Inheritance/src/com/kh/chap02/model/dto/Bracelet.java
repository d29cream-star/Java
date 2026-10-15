package com.kh.chap02.model.dto;

public class Bracelet extends Treasure {

	private double diameter;

	public Bracelet() {
		super();
	}

	public Bracelet(String name, double weight, double diameter) {
		super();
		this.diameter = diameter;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	
	}
	public String info() {
		return super.info() + ", 지름 : " + diameter;
	}
}