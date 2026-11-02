package com.kh.pet.controller;

import java.util.List;

import com.kh.pet.model.dto.Pet;
import com.kh.pet.model.service.PetService;

public class PetController {

	private PetService ps = new PetService();
	
	public List<Pet> read() {
		return ps.read();
	}
	public void save(String petID, String petName, int petAge, String ownerPhone) {
		ps.save(new Pet(petID, petName, petAge, ownerPhone));
	}
	public void delete(String petName) {
		ps.delete(petName);
	}
	public List<Pet> findByOwnerPhone(String ownerPhone) {
		return ps.findByOwnerPhone(ownerPhone);
	}
	public void update(String petID, int newPetAge) {
		ps.update(petID, newPetAge);
	}
}	
