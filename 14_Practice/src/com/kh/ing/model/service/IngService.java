package com.kh.ing.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.ing.model.dto.Ingredient;

public class IngService {

	private List<Ingredient> ingredients = new ArrayList<>();
	
	{
		ingredients.add(new Ingredient(1, "우유", 2, "냉장", "20261118"));
		ingredients.add(new Ingredient(2, "계란", 15, "냉장", "20261110"));
		ingredients.add(new Ingredient(3, "아이스크림", 3 ,"냉동", "20271111"));

	}
	public void save(Ingredient ig) {
		
	}
}
