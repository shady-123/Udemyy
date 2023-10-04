package com.sapient.hybris.service;

public class MaximumImpl implements Maximum {

	@Override
	public Integer max(Integer num1, Integer num2) {
		return (num1>num2)?num1:num2;
	}

}
