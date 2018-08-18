package Programming_Exercise_1_4;

import Employee.*;

import java.util.Scanner;
import java.io.*;

public class ExtendedHourlyCompany extends HourlyCompany
{
	//overload Company.run method to output best overtime pay
	//call run from main on new ExtendedHourlyCompany object
	
	public HourlyEmployee findBestOverTimePaid(Scanner sc)
	{
		HourlyEmployee bestPaidOvertime = new HourlyEmployee();
		while(sc.hasNext())
		{
			HourlyEmployee tmp = getNextEmployee(sc.nextLine());
			if(tmp.getOvertimePay() > bestPaidOvertime.getOvertimePay())
				bestPaidOvertime = tmp;
		}
		return bestPaidOvertime.getOvertimePay() != 0.0 ? bestPaidOvertime : null;
	}
		
	public void run()
		throws FileNotFoundException
	{
		System.out.println("Please enter the path for the file of employees: ");
		String filename = new Scanner(System.in).nextLine();
		Scanner sc = new Scanner(new File(filename));
		HourlyEmployee bestPaidOvertime = findBestOverTimePaid(sc);
		if(bestPaidOvertime == null)
			System.out.println("\n\nError: There were no employees scanned in.");
		else
			System.out.println("\n\nThe best-paid employee (and overtime pay) is " + bestPaidOvertime.getName()
					+ Employee.MONEY.format(bestPaidOvertime.getOvertimePay()));
	}
}
