package com.StreamPrograms;

import java.util.ArrayList;
import java.util.stream.Stream;

class Employee
{
	int empID;
	public Employee(int empID, String empName, long salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		Salary = salary;
	}
	String empName;
		long	Salary;
}
public class FilterMethodsExample {

	public static void main(String[] args) {
		
	
	ArrayList<Employee>li=new ArrayList<Employee>();
	
	li.add(new Employee(18461, "RamanRishi" , 48000));
	li.add(new Employee(18461, "ArunMozhiVarman" , 168000));
	li.add(new Employee(18461, "Chozha" , 100000));
	
	Stream<Employee> filter = li.stream().filter(f->f.Salary>50000);
	
	filter.forEach(Employee->System.out.println(Employee.empID +"  " +Employee.empName + " " +Employee.Salary));
}
}