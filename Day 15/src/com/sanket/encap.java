package com.sanket;

public class encap {
  public static void main(String args[])
  {
	  XTZ e=new XTZ();
	  e.setAge(30);
	  e.setName("Sanket");
	  e.setSalary(20000);
	  System.out.println(e.getAge()+"\n"+e.getName()+"\n"+e.getSalary());
  }
}

class XTZ
{
	private int age;
	private String name;
	private int salary;
	
	public int getAge() {
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setAge(int a)
	{
		age=a;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	
	public void setSalary(int s)
	{
		salary=s;
	}
}