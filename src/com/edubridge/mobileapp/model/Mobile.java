package com.edubridge.mobileapp.model;

public class Mobile {
	private String brand;
	private String color;
	private String camera;
	private String ram;
	private float price;
	
	
	public Mobile() {
		super();
	}


	public Mobile(String brand, String color, String camera, String ram, float price) {
		super();
		this.brand = brand;
		this.color = color;
		this.camera = camera;
		this.ram = ram;
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getCamera() {
		return camera;
	}


	public void setCamera(String camera) {
		this.camera = camera;
	}


	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", color=" + color + ", camera=" + camera + ", ram=" + ram + ", price="
				+ price + "]";
	}
	
	
}
