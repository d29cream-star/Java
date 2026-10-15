package com.kh.chap02.model.dto;

public class SwedenGoldCrown extends Treasure {

	private double purity;

	public SwedenGoldCrown() {
	}

	public SwedenGoldCrown(String name, double weight, double purity) {
		//super.name = name; //캡슐화 원칙 위반
		super(name, weight);
		//setName(name);
		//setWeight(weight);
		
		this.purity = purity;
	}

	public double getPurity() {
		return purity;
	}

	public void setPurity(double purity) {
		this.purity = purity;
	}
	
	
}
