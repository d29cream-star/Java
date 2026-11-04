package com.kh.ing.controller;

import com.kh.ing.model.dto.Ingredient;
import com.kh.ing.model.service.IngService;

public class IngController {

	private IngService is = new IngService();
	
	public void read(int ingredientId, String name, int quantity, String storageLocation, String useByDate) {
		
		Ingredient ig =	new Ingredient (ingredientId, name, quantity, storageLocation, useByDate);
		
		is.save(ig);
		
	}
}
