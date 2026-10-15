package com.kh.chap01.model.dto;

public class GoldBracelet {

	private String name;
	private double weight;
	private double diameter;

	public GoldBracelet() {

	}

	public GoldBracelet(String name, double weight, double diameter) {
		this.name = name;
		this.weight = weight;
		this.diameter = diameter;
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

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String info() {
		return "보물정보 = [보물명 : " + name + ", 무게 : " + weight + ", 지름 : " + diameter + "]";

	}
	
}