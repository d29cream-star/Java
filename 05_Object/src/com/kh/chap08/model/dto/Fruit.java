
package com.kh.chap08.model.dto;

public class Fruit {

	private String name;
	private String species;
	private int brix;
	
	public Fruit() {
		
	}
	public Fruit(String name, String species) {
		this.name = name;
		this.species = species;
		this.brix = (int)(Math.random()*25) + 1;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public void setBrix(int brix) {
		this.brix = brix;
	}
	public String getName() {
		return name;
	}
	public String getSpecies() {
		return species;
	}
	public int getBrix() {
		return brix;
	}
	public String info( ) {
		return "과일의 정보 = [이름 : " + name + ", 품종 : " + species + ", 당도 : " + brix + "]"	;
	}
	
	
}
