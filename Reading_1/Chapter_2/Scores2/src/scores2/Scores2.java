package scores2;

import java.util.*;
import java.io.*;

public class Scores2 
{
	public static final int SENTINEL = -1;
	public static void main(String[] args)
	{
		new Scores2().run();
	} // method main
	
	public void run()
	{
		final String INPUT_PROMPT = "\nOn each line, enter a test score (or " + SENTINEL + " to quit): ";
		final String RESULT = "\n\nThe sum of the scores is: ";
		
		PrintWriter printWriter = null; // to ensure printwriter is initialised before closed in finally block, 
										//otherwise will throw NullPointerException
		int sum = 0;
		try {
			System.out.println(INPUT_PROMPT);
			Scanner sc = new Scanner(System.in);
			printWriter = new PrintWriter(new BufferedWriter(new FileWriter("")));
			sum = addScores(sc, printWriter);
		} //try 
		catch(IOException exc) {
			System.out.println(exc);
		} //catch IOException 
		finally {
			printWriter.println(RESULT + sum);
			printWriter.close();
		} //finally
	} //method run
	
	public int addScores(Scanner sc, PrintWriter printWriter)
	{
		int sum = 0;
		boolean flag = false;

		while(sc.hasNext())
		{
			try {
				int score = sc.nextInt();
				if(score == SENTINEL)
					break;
				sum += score;
				printWriter.println(score);
				flag = true;
			} // try
			catch(InputMismatchException e) {
				printWriter.println(e + " " + sc.nextLine());
			} // catch InputMismatchException
		} // while
		
		if(!flag) 
			throw new RuntimeException("No valid scores were entered\n");
		
		return sum;
	} // method addScores
} //class Scores2
