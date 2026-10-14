package com.kh.chap08.controller;

import com.kh.chap08.model.dto.Fruit;
import com.kh.chap08.model.service.FruitService;

public class FruitController { //view와 service의 중간다리
	
		private FruitService fs = new FruitService();
		
		public void saveFruit (String name, String species) {
			//System.out.println("view에서 전달 받은 name : " + name);
			//System.out.println("view에서 전달 받은 species : " + species);
		
			//fs.saveFruit(name, species);
			
			Fruit f = new Fruit(name, species);
			fs.saveFruit(f);
		
		}
		public Fruit[] findFruit() { //getter
 			return fs.findFruit();
			
		}
		//public void fertilize() {
		//	fs.fertilize();}
		
		public void harvest() {
			fs.harvest();
		}
	
}
	
