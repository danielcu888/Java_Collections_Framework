package Employee;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Company 
{
	/**
	 * Returns the next full-time employee from the file scanned by a specified Scanner
	 * object.
	 * 
	 * @param line - line describing the employee
	 * 
	 * @return the next full-time employee scanned in the file.
	 */
	protected FullTimeEmployee getNextEmployee(String line)
	{
		if(line == null) return null;
		Scanner sc = new Scanner(line);
		String name = sc.next();
		double grossPay = sc.nextDouble();		
		return new FullTimeEmployee(name, grossPay);
	} // method getNextEmployee
	
	/**
	 *  Returns the best paid of all the full-time employees scanned in.
	 *  
	 * @param sc - the scanner object used to scan in the employees.
	 * 
	 * @return the best paid of all the full-time employees scanned in,
	 * 		   or null if there were no employees scanned in or if all
	 * 		   employees work for free.
	 */
	public FullTimeEmployee findBestPaid(Scanner sc)
	{
		FullTimeEmployee bestPaid = new FullTimeEmployee();
		while(sc.hasNextLine())
			{
				FullTimeEmployee tmp = getNextEmployee(sc.nextLine());
				if(tmp.getGrossPay() > bestPaid.getGrossPay())
					bestPaid = tmp;
			}
		return bestPaid.getGrossPay() == 0.0 ? null : bestPaid;
	} // method findBestPaid
	
	/**
	 * Determines and prints out the best paid of the full-time employees
	 * scanned in from a specified file.
	 * 
	 * @throws FileNotFoundException
	 */
	public void run()
		throws FileNotFoundException
	{
		System.out.println("Please enter the path for the file of employees: ");
		String filename = new Scanner(System.in).nextLine();
		Scanner sc = new Scanner(new File(filename));
		FullTimeEmployee bestPaid = findBestPaid(sc);
		if(bestPaid == null)
			System.out.println("\n\nError: There were no employees scanned in.");
		else
			System.out.println("\n\nThe best-paid employee (and gross pay) is " + bestPaid.toString());
	} // method run

	/*
	public static void main(String[] args)
		throws FileNotFoundException
	{
		new Company().run();
	} // method main
	 */
} //class Company

