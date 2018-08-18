package prog_ex_2_1;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.Result;
import static org.junit.runner.JUnitCore.runClasses;
import java.util.InputMismatchException;
public class Exercise_2_1Test
{
	public static void main(String[] args)
	{
		Result result = runClasses(Exercise_2_1Test.class);
		System.out.println("Tests run = " + result.getRunCount() +
							"\nTests failed = " + result.getFailures());
	}
	
	public static final double DELTA = 0.0000001;
	
	@Test
	public void prog_ex_2_1Test1() //stub
	{
		throw new UnsupportedOperationException();
	}
	
	@Test (expected = InputMismatchException.class)
	public void prog_ex_2_1Test2()
	{
		Exercise_2_1.foo("6.9 7.8 y");
	}

	@Test (expected = NullPointerException.class)
	public void prog_ex_2_1Test3()
	{
		Exercise_2_1.foo(null);		
	}

	@Test (expected = NumberFormatException.class)
	public void prog_ex_2_1Test4()
	{
		Exercise_2_1.foo("6.9 7.8");
	}
	
	@Test
	public void prog_ex_2_1Test5()
	{
		double ret = Exercise_2_1.foo("6.9 7.8 6.1");
		assertEquals(ret, 7.8, DELTA);
	}
}