package com.sapient.hybris.ui;

import java.time.LocalDate;
import java.util.Arrays;

import com.sapient.hybris.service.Employee;
import com.sapient.hybris.service.EmployeeSalComparator;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee employees[]= new Employee[5];
		populateEmployees(employees);
		System.out.println("Before sorting..");
		showEmployees(employees);
		//sorting based on empno
//		Arrays.sort(employees);
		//sorting based on ename
//		Arrays.sort(employees, new EmployeeNameComparator());
		
		//sorting based on sal
		Arrays.sort(employees,new EmployeeSalComparator());
		System.out.println("\nAfter sorting..");
		showEmployees(employees);		
		

	}

	private static void populateEmployees(Employee[] employees) {
		employees[0]= new Employee(1010,"Smith",LocalDate.of(2014, 10,10),"Manager",1289000.00,"IT");
		employees[1]= new Employee(1001,"Jones",LocalDate.of(2019, 8,18),"Developer",428900.00,"Hybris");
		employees[2]= new Employee(1015,"Clarke",LocalDate.of(2019, 12,15),"Manager",228900.00,"SFCC");
		employees[3]= new Employee(1004,"Miller",LocalDate.of(2016, 7,12),"Developer",928900.00,"ASDE");
		employees[4]= new Employee(1000,"Virat",LocalDate.of(2020, 1,1),"Developer",728900.00,"IT");
		
	}

	private static void showEmployees(Employee[] employees) {
		System.out.println("Employee details...");
		for(Employee e: employees) {
			System.out.println(e);
		}
		
	}

}
