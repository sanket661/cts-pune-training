package com.JUnit;


import static org.junit.Assert.assertEquals;


import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.CTS.StreamExampleTest;

public class Calculator {

	
	private static StreamExampleTest set;
	
	@BeforeClass
	public static void init()
	{
		set = new StreamExampleTest();
		System.out.println("Object created");
	}
	
	@AfterClass
	public static void destroy()
	{
		set=null;
		System.out.println("Object destroyed");
	}
	@Ignore
	@Test
	public void test_add_success()
	{
		assertEquals(17, set.add(12,5));
		System.out.println("Inside add test");
	}
	@Ignore
	@Test
	public void test_sub_success()
	{
		assertEquals(20, set.sub(10,30));
		System.out.println("Inside subtraction test");
	}
	@Ignore
	@Test
	public void test_mul_success()
	{
		assertEquals(300, set.mul(10,30));
		System.out.println("Inside multiplication test");
	}
	@Ignore
	@Test
	public void test_div_success()
	{
		assertEquals(3, set.div(30,10));
		System.out.println("Inside division test");
	}
	
	@Test
	public void test_mod_success()
	{
		assertEquals(1, set.mod(10,3));
		System.out.println("Inside modulus test");
	}

	@Test
	public void test_to_check_prime()
	{
		assertEquals(false, set.isPrime(4));
		System.out.println("Prime no");
	}
	

}
