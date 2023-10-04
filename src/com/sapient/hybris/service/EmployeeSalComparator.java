package com.sapient.hybris.service;

import java.util.Comparator;

public class EmployeeSalComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSal().compareTo(o2.getSal());
	}

}
