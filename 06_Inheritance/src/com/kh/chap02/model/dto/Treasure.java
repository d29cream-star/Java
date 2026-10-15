package com.kh.chap02.model.dto;

public class Treasure {

	private String name;
	private double weight;

	
	public Treasure() {
		System.out.println("부모");
		
	}

	public Treasure(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String info() {
		return "보물정보 = [보물명 : " + name + ", 무게 :" + weight + "]";
	}

	
}
