package com.mycompany.app;

import com.mycompany.app.Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest
{

	@Test
	public void testAdd() 
	{
		int exp = 30;
		Calculator cal = new Calculator();
		int act=cal.add(10,20);
		assertEquals(exp, act);
	}
	
	@Test
	public void testmul() 
	{
		int exp = 300;
		Calculator cal = new Calculator();
		int act=cal.multiply(10,30);
		assertEquals(exp, act);
	}
	

}
