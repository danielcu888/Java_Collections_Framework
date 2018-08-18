package programming_exercise_2_2;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;

import org.junit.*;
import org.junit.runner.Result;
import static org.junit.runner.JUnitCore.runClasses;

public class Programming_Exercise_2_2Test 
{
	static final double DELTA = 0.0001;
	
	public static void main(String[] args)
	{
		Result result = runClasses(Programming_Exercise_2_2Test.class);
		System.out.println("Tests run = " + result.getRunCount() +
							"/nTest failures = " + result.getFailures());
	}
	
	@Test (expected = NullPointerException.class)
	public void test1()
		throws FileNotFoundException
	{
		Programming_Exercise_2_2.foo(null);
	}

	@Test (expected = FileNotFoundException.class)
	public void test2()
			throws FileNotFoundException
	{
		Programming_Exercise_2_2.foo("/Users/danielcumberbatch/Documents/eclipse/JCF/Chapter_2/Programming_Exercise_2_2/src/programming_exercise_2_2/infile.txt");
	}

	@Test (expected = InputMismatchException.class)
	public void test3()
			throws FileNotFoundException
	{
		Programming_Exercise_2_2.foo("/Users/danielcumberbatch/Documents/eclipse/JCF/Chapter_2/Programming_Exercise_2_2/src/programming_exercise_2_2/infile1.txt");
	}
	
	@Test (expected = NumberFormatException.class)
	public void test4()
			throws FileNotFoundException
	{
		Programming_Exercise_2_2.foo("/Users/danielcumberbatch/Documents/eclipse/JCF/Chapter_2/Programming_Exercise_2_2/src/programming_exercise_2_2/infile2.txt");
	}

	@Test
	public void test5()
			throws FileNotFoundException
	{
		double result = Programming_Exercise_2_2.foo("/Users/danielcumberbatch/Documents/eclipse/JCF/Chapter_2/Programming_Exercise_2_2/src/programming_exercise_2_2/infile3.txt");
		Assert.assertEquals(34.6, result, DELTA);
	}

}
