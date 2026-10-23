package com.kh.khworld.controller;

import java.util.List;

import com.kh.khworld.model.dto.Attraction;
import com.kh.khworld.model.service.KhWorldService;

public class KhWorldController {

	private KhWorldService ks = new KhWorldService();
				
		public List<Attraction> readAttraction() {
			return ks.readAttractions();			
			
		}
		public void save(String name, String heightLimit, String location) {
			//Attraction a = new Attraction(name, heightLimit, location);
			ks.save(new Attraction(name, heightLimit, location));
		}
		
		public void deleteAttractions(String name) {
			ks.deleteAttractions(name);
		
		}
}