package com.kh.ing.model.dto;

public class Ingredient {

	private int ingredientId;
	private String name;
	private int quantity;
	private String storageLocation;
	private String useByDate;
	
	public Ingredient(int ingredientId, String name, int quantity, String storageLocation, String useByDate) {
		super();
		this.ingredientId = ingredientId;
		this.name = name;
		this.quantity = quantity;
		this.storageLocation = storageLocation;
		this.useByDate = useByDate;
	}

	public int getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(int ingredientId) {
		this.ingredientId = ingredientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public String getUseByDate() {
		return useByDate;
	}

	public void setUseByDate(String useByDate) {
		this.useByDate = useByDate;
	}

	@Override
	public String toString() {
		return "Ingredient [ingredientId=" + ingredientId + ", name=" + name + ", quantity=" + quantity
				+ ", storageLocation=" + storageLocation + ", useByDate=" + useByDate + "]";
	}
	
	
}
