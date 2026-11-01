package com.kh.pet.model.dto;

public class Pet {

	private String petID;
	private String petName;
	private int petAge;
	private String ownerPhone;
	
	public Pet(String petID, String petName, int petAge, String ownerPhone) {
		super();
		this.petID = petID;
		this.petName = petName;
		this.petAge = petAge;
		this.ownerPhone = ownerPhone;
	}
	public String getPetID() {
		return petID;
	}
	public void setPetID(String petID) {
		this.petID = petID;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getPetAge() {
		return petAge;
	}
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	public String getOwnerPhone() {
		return ownerPhone;
	}
	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}
	@Override
	public String toString() {
		return "Pet [petID=" + petID + ", petName=" + petName + ", petAge=" + petAge + ", ownerPhone=" + ownerPhone
				+ "]";
	}
	
}
