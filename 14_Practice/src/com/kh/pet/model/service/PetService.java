package com.kh.pet.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.pet.exception.DuplicatePetIDException;
import com.kh.pet.exception.InvalidPetAgeException;

import com.kh.pet.exception.PetNotFoundException;
import com.kh.pet.model.dto.Pet;

public class PetService {

	private List<Pet> pets = new ArrayList<>();
	
	{
		pets.add(new Pet("d01", "똘이", 11, "010-2258-1123"));
		pets.add(new Pet("d02", "우유", 8, "010-2258-1123"));
		pets.add(new Pet("c01", "다찌", 9, "010-5843-7143"));
	}
	
	public List<Pet> read() {
		return new ArrayList<>(pets);
	}
	
	public void save(Pet p) {
		petIDCheck(p.getPetID());
		petAgeCheck(p.getPetAge());
		pets.add(p);
	}
	public void petIDCheck(String petID) {
		boolean exist = pets.stream()
							.anyMatch(p -> p.getPetID().equals(petID));
		if (exist) {
			throw new DuplicatePetIDException ("이미 등록된 ID입니다.");
		}
		
		for(Pet p : pets) {
			if (p.getPetID().equals(petID)) {
				throw new DuplicatePetIDException("이미 등록된 ID입니다.");
			}
		}
	}
	public void petAgeCheck(int petAge) {
		if(petAge <= 0) {
			throw new InvalidPetAgeException("동물 나이는 0보다 작을 수 없습니다.");
		}
	}
	public void delete(String petName) {
		for(int i = 0; i < pets.size(); i ++) {
			if (pets.get(i).getPetName().equals(petName)) {
				pets.remove(i);
				return;
			}
		}
		throw new PetNotFoundException("해당 동물이 없습니다.");
	}
	public List<Pet> findByOwnerPhone(String ownerPhone) {
		return pets.stream()
				   .filter(p->p.getOwnerPhone().equals(ownerPhone))
				   .toList();
	}
	public void update(String petID, int newPetAge) {
		for(Pet p : pets) {
			if(p.getPetID().equals(petID)) {
				p.setPetAge(newPetAge);;
				return;
			}
		}
		throw new PetNotFoundException("해당 동물이 없습니다.");
	}
}
