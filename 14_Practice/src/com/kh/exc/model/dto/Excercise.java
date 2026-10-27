package com.kh.exc.model.dto;

public class Excercise {

	private String name;
	private int weight;
	private int count;
	private String target;
	
	public Excercise(String name, int weight, int count, String target) {
		super();
		this.name = name;
		this.weight = weight;
		this.count = count;
		this.target = target;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	@Override
	public String toString() {
		return "Excercise [name=" + name + ", weight=" + weight + ", count=" + count + ", target=" + target + "]";
	}
	
	
}
