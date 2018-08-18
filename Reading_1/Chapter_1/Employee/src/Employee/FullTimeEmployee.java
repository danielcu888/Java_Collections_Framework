package Employee;

public class FullTimeEmployee implements Employee
{
	protected String name;
	protected double grossPay;

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
	 * @param _name - the specified name.
	 * @param _grossPay - the specified gross pay.
	 * 
	 */
	public FullTimeEmployee(String _name, double _grossPay)
	{
		name = _name;
		grossPay = _grossPay;
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
	 * Returns the gross pay of this FullTimeEmployee object.
	 * 
	 * @return the gross pay of this FullTimeEmployee object.
	 * 
	 */
	public double getGrossPay()
	{
		return grossPay;
	} // method getGrossPay
	
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
		return name + Employee.MONEY.format(grossPay) + " FULL TIME";
	} // method toString
} // class FullTimeEmployee
