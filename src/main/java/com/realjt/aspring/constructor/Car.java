package com.realjt.aspring.constructor;

public class Car
{
	private String brand;

	private String crop;

	private int price;

	private double maxSpeed;

	public Car(String brand, String crop, int price)
	{
		super();
		this.brand = brand;
		this.crop = crop;
		this.price = price;
	}

	public Car(String brand, String crop, double maxSpeed)
	{
		super();
		this.brand = brand;
		this.crop = crop;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString()
	{
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price
				+ ", maxSpeed=" + maxSpeed + "]";
	}

}