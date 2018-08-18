package Age;

import java.util.Scanner;

public class Age 
{
	protected int highestAge;
	
	/**
	 * Initializes this Age object
	 */
	public Age()
	{
		highestAge = 0;
	} // default constructor
	
	/**
	 * 
	 * Returns the highest age of the ages scanned in from the keyboard.
	 * The sentinel is -1.
	 * 
	 * @param sc - the Scanner used to scan in the ages
	 * @return the highest age of the ages scanned in by sc.
	 */
	public int findHighestAge(Scanner sc)
	{
		final int SENTINEL = -1;
		
		int max = 0;
		while(true)
		{
			System.out.println("Please enter a new age: ");
			int tmp = sc.nextInt();
			if(tmp == SENTINEL)
				break;
			max = tmp > max ? tmp : max;
		} //while
		return max;
	} //method findHighestAge
	
	public static void main(String[] args)
	{
		Age a = new Age();
		Scanner sc = new Scanner(System.in);
		System.out.println("The higest age was: " + a.findHighestAge(sc));
	}
}