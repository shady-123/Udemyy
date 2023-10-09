package com.sapient.hybris.service;

public class FactorialImplementation implements Factorial {

	@Override
	public int findFact(int n) {
		if(n == 0)
			return 1;
		return n * findFact(n-1);
	}

}
