package com.kh.pet.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.pet.exception.DuplicatePetIDException;
import com.kh.pet.exception.InvalidPetAgeException;
import com.kh.pet.model.dto.Pet;

public class PetService {

	private List<Pet> pets = new ArrayList<>();
	
	{
		pets.add(new Pet("p01", "똘이", 11, "010-2536-9618"));
		pets.add(new Pet("p02", "나비", 8, "010-1157-2846"));
		pets.add(new Pet("p03", "다찌", 6, "010-4852-4851"));
	}
	
	public List<Pet> read() {
		return pets;
			
	}

	public void save(Pet p) {
		IDCheck(p.getPetID());
		ageCheck(p.getPetAge());
		pets.add(p);			
	}
	public void IDCheck(String petID) {
		if(petID.equals(petID)) {
			throw new DuplicatePetIDException ("이미 등록된 ID입니다.");
		}
	}
	public void ageCheck(int petAge) {
		if( petAge <= 0) {
			throw new InvalidPetAgeException ("0이하는 등록할 수 없습니다.");
		}
	}
	public void delete(String petID) {
		for(int i = 0; i < pets.size(); i ++) {
			if(pets.get(i).getPetID().equals(petID)) {
				pets.remove(i);
				return;
			}
		}
	}

}
