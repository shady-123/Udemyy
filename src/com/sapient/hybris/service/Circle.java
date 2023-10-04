package com.sapient.hybris.service;

/**
 * Circle is concrete sub class since it has overridden abstract method of Shape class 
 * hence Circle class can be instantiated
 * 
 */
public class Circle extends Shape{
	private Double radius;

	public Circle() {

	}

	public Circle(Double radius) {
		this.radius=radius;
	}



	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	//we are overriding the abstract method of super class
	@Override
	public Double computeArea() {
		//Math is built-in class of java.lang package
		return Math.PI * this.radius* this.radius;
	}

}
