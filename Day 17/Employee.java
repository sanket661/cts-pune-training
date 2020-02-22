package com.sanket;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
  int id,age;
  String Name;
  String address;
  String designation;
  int salary;
 
  public Employee() {
	  
  }
public Employee(int id, int age, String name, String address, String designation, int salary) {
	super();
	this.id = id;
	this.age = age;
	Name = name;
	this.address = address;
	this.designation = designation;
	this.salary = salary;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "ID : "+id+" Age: "+age+" Name: "+Name+" Address: "+address+" Designation: "+designation+" Salary: "+salary;
}
@Override
public int compareTo(Employee emp) {
	if(this.id > emp.id)
	{
		return -1;
	}else if(this.id==emp.id)
	{
		return 0;
	}else {
	
	return 1;
	}
}

}

class SortById implements Comparator<Employee>{
	public int compare(Employee emp1, Employee emp2)
	{
		if(emp1.getId()>emp2.getId())
				return 1;
		else if(emp1.getId()==emp2.getId())
					return 0;
	    else return -1;
	}
}
class SortByAge implements Comparator<Employee>{
	public int compare(Employee emp1, Employee emp2)
	{
		if(emp1.getAge()>emp2.getAge())
				return 1;
		else if(emp1.getAge()==emp2.getAge())
					return 0;
	    else return -1;
	}
}

class SortByName implements Comparator<Employee>{
	public int compare(Employee emp1, Employee emp2)
	{
		return emp1.getName().compareTo(emp2.getName());
	}
}
class SortByAddress implements Comparator<Employee>{
	public int compare(Employee emp1, Employee emp2)
	{
		return emp1.getAddress().compareTo(emp2.getAddress());
	}
}
class SortByDesignation implements Comparator<Employee>{
	public int compare(Employee emp1, Employee emp2)
	{
		return emp1.getDesignation().compareTo(emp2.getDesignation());
	}
}
  

