package Problem_1_1;

import Employee.FullTimeEmployee;
import Employee.HourlyEmployee;

public class Problem_1_1 
{
	public static void main(String[] args)
	{
		FullTimeEmployee full = new FullTimeEmployee();
		HourlyEmployee hourly = new HourlyEmployee();
		
		full = hourly;
		hourly = (HourlyEmployee)full;
	}
}
