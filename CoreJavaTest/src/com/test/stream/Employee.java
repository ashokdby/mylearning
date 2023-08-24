package com.test.stream;

public class Employee {
	private long id;
	private String empName;
	private String empDepartment;
	private long empAge;
	private long empSalary;
	
	public Employee(long id, String empName, String empDepartment, long empAge, long empSalary) {
		super();
		this.id = id;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public long getEmpAge() {
		return empAge;
	}

	public void setEmpAge(long empAge) {
		this.empAge = empAge;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}
	
}
