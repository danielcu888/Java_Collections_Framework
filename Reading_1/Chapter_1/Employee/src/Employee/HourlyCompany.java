package Employee;

import java.util.Scanner;
import java.io.*;

public class HourlyCompany extends Company
{
	/**
	 * Returns the next full-time HourlyEmployee from the file scanned by a specified Scanner
	 * object.
	 * 
	 * @param line - line describing the employee
	 * 
	 * @return the next full-time HourlyEmployee scanned in the file.
	 */
	protected HourlyEmployee getNextEmployee(String line)
	{
		if(line == null) return null;
		Scanner sc = new Scanner(line);
		String name = sc.next();
		int hoursWorked = sc.nextInt();
		double payRate = sc.nextDouble();
		return new HourlyEmployee(name, hoursWorked, payRate);
	} //method getNextEmployee
	
	/*public static void main(String[] args)
		throws FileNotFoundException
	{
		new HourlyCompany().run();
	} // method main
	 */
} // class HourlyEmployee
