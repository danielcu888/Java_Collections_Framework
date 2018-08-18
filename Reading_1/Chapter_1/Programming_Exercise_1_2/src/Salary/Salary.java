package Salary;

import java.util.Vector;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Salary 
{
	final static DecimalFormat MONEY = new DecimalFormat(" £#,###.00");
	
	protected Vector<Double> salaries;
	protected double average;
	
	/**
	 * Initializes this Salary object
	 */
	public Salary()
	{
		salaries = new Vector<Double>();
		average = 0.0;
	} // default constructor
	
	/**
	 * 
	 * Returns the average salary of the salarues scanned in from the keyboard.
	 * The sentinel is -1.
	 * 
	 * @param sc - the Scanner used to scan in the salaries
	 * @return the average salary of the ages scanned in by sc.
	 */
	public double findAverageSalary(Scanner sc)
	{
		final double SENTINEL = -1.0;
		
		while(true)
		{
			System.out.println("Please enter a new salary: ");
			double tmp = sc.nextDouble();
			if(tmp == SENTINEL)
				break;
			salaries.add(tmp);
		}
		
		return average();
	} //method findAverageSalary
	
	/**
	 *  Calculates the average value of the values stored in salaries.
	 *  
	 * @return the average value of the values stored in salaries.
	 */
	public double average()
	{
		if(salaries.isEmpty()) return 0.0;
		double av = 0.0;
		for(int i = 0; i != salaries.size(); ++i)
			av += salaries.elementAt(i);
		return av/salaries.size();
	} // method average
	
	
	public static void main(String args[])
	{
		Salary s = new Salary();
		Scanner sc = new Scanner(System.in);
		System.out.println("The average salary was: " + Salary.MONEY.format(s.findAverageSalary(sc)));
	} // method main
} // class Salary



