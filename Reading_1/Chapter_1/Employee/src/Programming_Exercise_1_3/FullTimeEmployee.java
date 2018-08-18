package Programming_Exercise_1_3;
import Employee.Employee;

public class FullTimeEmployee implements Employee
{
	private String name;
	private double grossPay;

	/**
	 * Initializes this FullTimeEmployee object to have an empty String for the name and 0.0
	 * for the gross pay.
	 *  
	 */
	public FullTimeEmployee()
	{
		name = "";
		grossPay = 0.0;
	} // default constructor
	
	/**
	 * Initializes this FullTimeEmployee object's name and gross pay from a 
	 * specified name and gross pay.
	 *
	 * @param name - the specified name.
	 * @param grossPay - the specified gross pay.
	 * 
	 */
	 public FullTimeEmployee(String name, double grossPay)
	 {
		 this.name = name;
		 this.grossPay = grossPay;
	 } // 2-parameter constructor
	 
	/**
	 *  Returns the name of this FullTimeEmployee object.
	 *  
	 *  @return the name of this FullTimeEmployee object.
	 *  
	 */
	public String getName()
	{
		return name;
	} // method getName

	/**
	 * Sets the name of this FullTimeEmployee object.
	 *  
	 * @param nameIn - the new name of this FullTimeEmployee object.
	 */
	public void setName(String nameIn)
	{
		name = nameIn;
	} //method setName
	
	/**
	 * Returns the gross pay of this FullTimeEmployee object.
	 * 
	 * @return the gross pay of this FullTimeEmployee object.
	 * 
	 */
	public double getGrossPay()
	{
		return grossPay;
	} //method getGrossPay
	 
	/**
	 * Sets the grossPay of this FullTimeEmployee object.
	 *  
	 * @param grossPayIn - the new grossPay of this FullTimeEmployee object.
	 */
	public void setGrossPay(double grossPayIn)
	{
		grossPay = grossPayIn;
	} //method setGrossPay
	
	/**
	 *  Returns a String representation of this Employee object with the name
	 *  followed by a space followed by a dollar sign followed by the gross weekly
	 *  pay, with two fractional digits (rounded), followed by "FULL TIME".
	 *  
	 * @return a String representation of this Employee object.
	 * 
	 */
	public String toString()
	{
		return name + " " + Employee.MONEY.format(grossPay) + " FULL TIME";
	} //method toString
} // class FullTimeEmployee
