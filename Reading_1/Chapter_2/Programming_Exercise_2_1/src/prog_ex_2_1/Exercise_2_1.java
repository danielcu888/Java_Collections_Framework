package prog_ex_2_1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_2_1 
{
	/**
	 * Returns the maximum of 3 doubles contained in the specified String object
	 * which is scanned in by a local Scanner object.
	 * 
	 * @param s - specified String object
	 * 
	 * @return the largest of the 3 doubles scanned in.
	 * 
	 * @throws NullPointerException - for null string
	 * 
	 * @throws InputMisMatchException - for incorrectly formatted string
	 * 
	 * @throws NumberFormatException - if less than 3 doubles provided
	 *
	 */
	static double foo(String s)
	{
		ArrayList<Double> a = new ArrayList<Double>();
		try {
			Scanner sc = new Scanner(s);
			while(sc.hasNext() && a.size() < 3)
			{
				try {
					double tmp = sc.nextDouble();
					a.add(tmp);
				} catch(InputMismatchException exc) {
					throw new InputMismatchException();
				}
			}
		} catch (NullPointerException exc2) {
			throw new NullPointerException();
		}
		if(a.size() != 3)
			throw new NumberFormatException();
		double ret = 0;
		for(double d : a)
			if(d > ret) ret = d;
		return ret;
		
		//return 0.0;
	}
	
	public void run()
	{
		String s = "5.6 6.7 8.7";
		System.out.println(Exercise_2_1.foo(s));
	}
	
	public static void main(String[] args)
	{
		new Exercise_2_1().run();
	}
}
