package com.sapient.hybris.ui;

import com.sapient.hybris.service.Circle;
import com.sapient.hybris.service.Rectangle;
import com.sapient.hybris.service.Shape;
import com.sapient.hybris.service.Triangle;

public class ShapeDemo {

	public static void main(String[] args) {
		//Array of references of Shape type
		Shape shapes[]= new Shape[5];
		
		shapes[0]= new Circle(5.0);
		shapes[1]= new Rectangle(10.0,5.0);
		shapes[2]= new Rectangle(5.0,5.0);
		shapes[3]= new Circle(10.0);
		shapes[4]= new Triangle(8.0,7.5,8.2);
		
		for(Shape s: shapes) {
			if(s instanceof Circle) {
				System.out.println("Area of circle: "+ s.computeArea());
			}else if(s instanceof Rectangle) {
				System.out.println("Area of rectangle: "+ s.computeArea());
			}else if( s instanceof Triangle) {
				System.out.println("Area of traingle: "+ s.computeArea());
			}
		}

	}

}
