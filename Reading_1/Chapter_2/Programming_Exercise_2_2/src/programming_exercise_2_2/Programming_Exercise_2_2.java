package programming_exercise_2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programming_Exercise_2_2 
{
	public static double foo(String fileName)
		throws FileNotFoundException
	{
		/*
		 throw new UnsupportedOperationException(); //stub
		 return 0.0;
		*/
		if(fileName == null) 
			throw new NullPointerException();
	
		double ret = 0.0;
		
		try {
			Scanner sc = new Scanner(new File(fileName));
		
			boolean atLeastOneValidEntry = false;
			
			while(sc.hasNext())
			{
				try {
					double tmp = sc.nextDouble();
					ret  = Math.max(ret, tmp);
					atLeastOneValidEntry = true;
				} catch(InputMismatchException imme) {
					sc.nextLine();
					//throw new InputMismatchException(); //have to diable this to test for numberformatexception
				}
			}
			if(!atLeastOneValidEntry)
				throw new NumberFormatException("No valid entries were found.");
		} catch(FileNotFoundException fnfe) {
			//throw new FileNotFoundException();
			System.out.println("File path not found");
		}
		return ret;
	}
	
	public void run() 
			throws FileNotFoundException
	{
		String s = "/Users/danielcumberbatch/Documents/eclipse/JCF/Chapter_2/Programming_Exercise_2_2/src/programming_exercise_2_2/infile3.txt";
		System.out.println(Programming_Exercise_2_2.foo(s));
	}
	
	public static void main(String[] args) 
			throws FileNotFoundException
	{
		new Programming_Exercise_2_2().run();
	}
}
