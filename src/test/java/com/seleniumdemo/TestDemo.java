package com.seleniumdemo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestDemo {
	
	@Test
	public void m()
	{
		assertEquals("Avi", "Avi");
	}
	
	@Test
	public void m1()
	{
		System.out.println("Hello");
	}

}
