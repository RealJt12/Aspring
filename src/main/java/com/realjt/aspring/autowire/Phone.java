package com.realjt.aspring.autowire;

public class Phone
{
	/**
	 * 品牌
	 */
	private String brand;

	/**
	 * 系统类型
	 */
	private String system;

	/**
	 * 架构
	 */
	private String arch;

	/**
	 * 屏幕尺寸
	 */
	private float size;

	/**
	 * 摄像头
	 */
	private int camera;

	/**
	 * 内存
	 */
	private int memery;

	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public String getSystem()
	{
		return system;
	}

	public void setSystem(String system)
	{
		this.system = system;
	}

	public String getArch()
	{
		return arch;
	}

	public void setArch(String arch)
	{
		this.arch = arch;
	}

	public float getSize()
	{
		return size;
	}

	public void setSize(float size)
	{
		this.size = size;
	}

	public int getCamera()
	{
		return camera;
	}

	public void setCamera(int camera)
	{
		this.camera = camera;
	}

	public int getMemery()
	{
		return memery;
	}

	public void setMemery(int memery)
	{
		this.memery = memery;
	}

	@Override
	public String toString()
	{
		return "Phone [brand=" + brand + ", system=" + system + ", arch="
				+ arch + ", size=" + size + ", camera=" + camera + ", memery="
				+ memery + "]";
	}

}