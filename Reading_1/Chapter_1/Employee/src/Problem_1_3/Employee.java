package Problem_1_3;

import java.text.DecimalFormat;

public interface Employee
{
	final static DecimalFormat MONEY = new DecimalFormat(" $#,###.00");
	
	/**
	 * Returns this Employee object's name.
	 * 
	 * @return this Employee object's name.
	 * 
	 */
	String getName();
	
	/**
	 *  Returns this Employee object's gross pay.
	 *  
	 * @return this Employee object's gross pay.
	 * 
	 */
	double getGrossPay();
	
	/**
	 *  Returns a String representation of this Employee object with the name
	 *  followed by a space followed by a dollar sign followed by the gross weekly
	 *  pay, with two fractional digits (rounded), followed by the employment status
	 *  of this object.
	 *  
	 * @return a String representation of this Employee object.
	 * 
	 */
	String toString();
}