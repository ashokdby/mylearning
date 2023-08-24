package com.test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import com.test.stream.Employee;
import java.util.stream.*;

public class EmpAcrDept {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1, "Ashok", "IT", 43,4563));
		emp.add(new Employee(2, "Amit", "HR", 40,455555));
		emp.add(new Employee(3, "Anil", "ABC", 38,666554));
		emp.add(new Employee(4, "Ayush", "IT", 17,1233453));
		
		
		//Map<String, Long> collect =emp.stream().collect(Collectors.groupingBy(Employee::getEmpDepartment(), Collectors.counting()));
		//emp.stream().map(Employee::getEmpDepartment).distinct().forEach(System.out::println);
		//Find employee according to his department
			Map<String, Long> dept = emp.stream().collect(Collectors.groupingBy(Employee::getEmpDepartment,Collectors.counting()));
			System.out.println(dept);
		//Find the even number in given digit
			List<Integer> intlist = Arrays.asList(1,2,3,4,5,6,7,8,9);
			List<Integer> evenlist = intlist.stream().filter(n->n%2==0).collect(Collectors.toList());
			System.out.println(evenlist);
		//Find highest paid employee
			Optional<Employee> empSalary   = emp.stream().collect(Collectors.maxBy(Comparator.comparingLong(Employee::getEmpSalary)));
			System.out.println(empSalary.get().getEmpSalary());
			
		
	}

	
}
