package Programming_Exercise_2_3;

import java.util.*;
import java.io.*;

class FullTimeEmployee {}

public class Company 
{
	public static void main(String[] args)
		throws FileNotFoundException
	{
		new Company().run();
	}

	protected FullTimeEmployee findBestPaid(Scanner sc){return null;}

	public void run()
	{
		final String INPUT_PROMPT = "Please Enter the path for the file of the employees: ";
		final String OUTPUT_PROMPT = "Please Enter the path for the output file: ";
		final String BEST_PAID_MESSAGE = "\n\nThe best-paid employee (and gross pay) is: ";
		final String NO_INPUT_MESSAGE = "\n\nError: There were no employees scanned in: ";
		final String REPROMPT = "\n\nError: Invalid path, please try again.\n\n";
		
		Scanner sc, keyBoardScanner = new Scanner(System.in);
		PrintWriter p = null;
		FullTimeEmployee bestPaid = null;
		
		try {
			while(true)
			{
				try {
					//read input filename path
					System.out.print(INPUT_PROMPT);
					sc = new Scanner(new File(keyBoardScanner.nextLine()));
		
					//read output filename path
					System.out.print(OUTPUT_PROMPT);
					p = new PrintWriter(new BufferedWriter(new FileWriter(keyBoardScanner.nextLine())));
			
					//calculate best paid fulltimeemployee
					bestPaid = findBestPaid(sc);
					
					//break while loop if got this far
					break; 
				} catch(IOException ioe) { //catch exception from invalid input/output filename path
					System.out.println(REPROMPT);
				}
			}
		} catch (NullPointerException npe) { //catch null pointer to bestPaid if no valid employees scanned in from input file
			System.out.println(NO_INPUT_MESSAGE);
		} finally { 
			if(bestPaid != null)
				System.out.println(BEST_PAID_MESSAGE + bestPaid.toString()); //write result if bestpaid != null
			p.close(); //flush output buffer
		}
	} //method run
	
}
