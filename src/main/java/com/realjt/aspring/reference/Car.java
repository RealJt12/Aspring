package com.realjt.aspring.reference;

public class Car
{
	/**
	 * 品牌
	 */
	private String brand;

	/**
	 * 产地
	 */
	private String crop;

	private int price;

	private double maxSpeed;

	public Car()
	{

	}

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

	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public String getCrop()
	{
		return crop;
	}

	public void setCrop(String crop)
	{
		this.crop = crop;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public double getMaxSpeed()
	{
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString()
	{
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price
				+ ", maxSpeed=" + maxSpeed + "]";
	}

}