package com.sapient.hybris.service;

public class Triangle extends Shape{
	private Double side1;
	private Double side2;
	private Double side3;
	
	
	public Triangle() {		
		
	}


	public Triangle(Double side1, Double side2, Double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}


	public Double getSide1() {
		return side1;
	}


	public void setSide1(Double side1) {
		this.side1 = side1;
	}


	public Double getSide2() {
		return side2;
	}


	public void setSide2(Double side2) {
		this.side2 = side2;
	}


	public Double getSide3() {
		return side3;
	}


	public void setSide3(Double side3) {
		this.side3 = side3;
	}

	/*
	 * Here the method computeArea() is using the method sqrt() of Math class
	 * to complete the task. This is called as dependency association
	 */

	@Override
	public Double computeArea() {
		/* Area of scalane square root of s*(s-a)*(s-b)*(s-c)
		 * where s is a+b+c/2.
		 * 
		 * Here this method is "uses-a" method of Math class
		 * 
		 */
		double s= (this.side1+this.side2+this.side3)/2;
		return Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
	}
	
	
}
