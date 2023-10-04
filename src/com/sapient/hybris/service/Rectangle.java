package com.sapient.hybris.service;

/*
 * Rectangle is concrete sub class since it has overridden abstract method of Shape class 
 * hence Retangle class can be instantiated
 * 
 */
public class Rectangle extends Shape{
	private Double length;
	private Double width;
	
	public Rectangle() {
		
	}

	public Rectangle(Double length, Double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	@Override
	public Double computeArea() {
		return this.length*this.width;
	}
	
	

}
