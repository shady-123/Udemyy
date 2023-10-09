package com.sapient.hybris.ui;

import com.sapient.hybris.service.Factorial;
import com.sapient.hybris.service.FactorialImplementation;

public class Fact {

	public static void main(String[] args) {
		
		Factorial fact = new FactorialImplementation();
		System.out.println(fact.findFact(5));

	}

}
