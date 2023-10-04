package com.sapient.hybris.service;

import java.time.LocalDate;
//POJO(Plain Old Java Object) class
/*
 * In a POJO class, data members are private, has a default constructor
 * and public getter/setter methods.
 * 
 */
/*
 * String class and all wrapper classes have implemented Comparable interface
 */
public class Employee implements Comparable<Employee>{
	//instance data members
	private Integer empno;
	private String ename;
	private LocalDate hiredate;
	private String job;
	private Double sal;
	private String dname;
	
	//static data member
	private static String companyName;
	
	//initializing static data member using static block
	static {
		companyName="Publicis Sapient Pvt. Ltd.";
	}

	//default constructor
	public Employee() {
		
	}
	
		
	//all-arg constructor		
	public Employee(Integer empno, String ename, LocalDate hiredate, String job, Double sal, String dname) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.job = job;
		this.sal = sal;
		this.dname = dname;
	}

	public Integer getEmpno() {
		return empno; // empno is same this.empno i.e current object's empno
	}

	public void setEmpno(Integer empno) {
		this.empno = empno; //invoking object's empno = value in formal parameter
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}


	@Override
	public String toString() {
		return "\nEmpno=" + empno + "\nEname=" + ename + "\nHiredate=" + hiredate + "\nJob=" + job + "\nSalary="
				+ sal + "\nDepartment=" + dname;
	}


	//compare Employee objects based on their empno
	@Override
	public int compareTo(Employee o) {
		return this.getEmpno().compareTo(o.getEmpno());
	}


	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}
