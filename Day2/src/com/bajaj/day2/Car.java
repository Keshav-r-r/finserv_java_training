package com.bajaj.day2;

class Car {
	private String brandName, modelName;
	private int price;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Car(String brandName, String modelName, int price) {
		super();
		this.brandName = brandName;
		this.modelName = modelName;
		this.price = price;
	}
	public String toString() {
		return "Car [brandName = "+brandName+", modelName = "+modelName+", price = "+price+"]";
	}
}
