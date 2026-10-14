package com.kh.chap08.model.service;

import com.kh.chap08.model.dto.Fruit;

public class FruitService { // 연산

	//private Fruit fruit;
	//private Fruit secondFruit;
	//	private Fruit thirdFruit;
	private Fruit[] fruits = new Fruit[3];

	public void saveFruit(Fruit f) { // setter
	/*	if(fruit == null) {
			this.fruit = f;
		}else if ( secondFruit == null ){
			this.secondFruit = f;
		}else if ( thirdFruit == null ){ 
			this.thirdFruit = f;*/
	for(int i = 0; i< fruits.length; i++) {
		if(fruits[i] == null) {
			fruits[i] = f;
			return;
		}
	}
		
}

	public Fruit[] findFruit() { // getter
		//return fruit;
		//빈 과일이 하나라도 존재한다면 null을 반환

		return fruits;
				
	}

	/*public void fertilize() {
		fruit.setBrix(fruit.getBrix() + 1);
		System.out.println("과일의 당도는 : " + fruit.getBrix() + " 입니다.");
	}*/

	public Fruit[] harvest() {
		return fruits;
		//fruit.setBrix(0);
		//fruit.setName(null);
		//fruit.setSpecies(null);
	}
}
