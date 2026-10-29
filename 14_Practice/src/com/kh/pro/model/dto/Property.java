package com.kh.pro.model.dto;

public class Property {

	private String name;
	private int price;
	private String grade;
	private String location;
	
	public Property(String name, int price, String grade, String location) {
		super();
		this.name = name;
		this.price = price;
		this.grade = grade;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Property [grade=" + grade + ", location=" + location + ", name=" + name + ", price=" + price + "]";
	}
	
}
