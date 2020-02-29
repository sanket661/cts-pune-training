package com.CTS;

public class StreamExampleTest {

	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		if(a>b)
		  return a-b;
		else
			return b-a;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	public int mod(int a,int b)
	{
		return a%b;
	}
	public boolean isPrime(int n)
	{   boolean status=true;
		for(int i=2;i<=n/2;i++) {
			status=false;
			break;
		}
		return status;
	}
	
}
