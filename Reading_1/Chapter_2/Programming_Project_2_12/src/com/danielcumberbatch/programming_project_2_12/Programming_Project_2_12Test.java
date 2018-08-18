package com.danielcumberbatch.programming_project_2_12;

import org.junit.*;
import org.junit.runner.Result;
import static org.junit.runner.JUnitCore.runClasses;

public class Programming_Project_2_12Test 
{
	private FullTimeEmployee f1, f2, f3, f4;
	
	public static void main(String[] args)
	{
		Result result = runClasses(Programming_Project_2_12Test.class);
		System.out.println("Tests run = " + result.getRunCount() +
						   "\n\nTests failed = " + result.getFailures());
	}

	@Before
	public void runBeforeEveryTest()
	{
		f1 = new FullTimeEmployee("Dan", 1.1);
		f2 = new FullTimeEmployee("Jo", 0.1);
		f3 = new FullTimeEmployee("Jo", 0.1);
		f4 = new FullTimeEmployee("Jo", 0.1);
	}
	
	@Test
	public void testReflexivity() 
	{
		Assert.assertTrue(f1.equals(f1));
	}

	@Test
	public void testSymmetry()
	{
		Assert.assertTrue(f2.equals(f3));
		Assert.assertTrue(f3.equals(f2));
	}
	
	@Test
	public void testTransivity()
	{
		Assert.assertTrue(f2.equals(f3));
		Assert.assertTrue(f3.equals(f4));
		Assert.assertTrue(f2.equals(f4));
	}
	
	@Test
	public void testConsistency()
	{
		Assert.assertTrue(f2.equals(f3));
		Assert.assertTrue(f2.equals(f3));
	}
	
	@Test
	public void testActuality()
	{
		Assert.assertFalse(f1.equals(null));
	}
}