package scores3;

import java.util.*; //for Scanner
import java.io.*; //for PrintWriter

public class Scores3 
{
	public static void main(String[] args)
	{
		new Scores3().run();
	} // method main
	
	private void run()
	{
		final String IN_FILE_PROMPT = "\nPlease enter an input file name:\n";
		final String OUT_FILE_PROMPT = "\nPlease enter an output file name:\n";
		final String RESULT = "\n\nThe sun of the scores is: ";
		
		Scanner KeyBoardScanner = new Scanner(System.in), fileScanner;
		PrintWriter printWriter = null;
		
		int sum = 0;
		
		try { //to catch NumberFormatException thrown by addScores if no legal scores in input file
			while(true)
			{
				try {  //to catch FileNotFoundException if input/output file path(s) not recognized
					System.out.println(IN_FILE_PROMPT);
					fileScanner = new Scanner(KeyBoardScanner.nextLine());
					System.out.println(OUT_FILE_PROMPT);
					printWriter = new PrintWriter(new BufferedWriter(new FileWriter(KeyBoardScanner.nextLine())));
					sum = addScores(fileScanner, printWriter);
					break;
				} catch(IOException exc2) {
					System.out.println(exc2);
				}
			}
		} catch(NumberFormatException exc) {
			System.out.println(exc);
		}
		finally
		{
			printWriter.println(RESULT + sum);
			printWriter.close();
		}
	}
	
	private int addScores(Scanner fileScanner, PrintWriter printWriter)
	{
		final String NO_LEGAL_SCORES_MESSAGE = "The input contained no legal scores.";
		boolean atLeastOneLegalScore = false;
		int score, sum = 0;
		while(fileScanner.hasNext())
		{
			try {
				score = fileScanner.nextInt();
				printWriter.println(score);
				sum += score;
				atLeastOneLegalScore = true;
			} catch(InputMismatchException exc) {
				fileScanner.nextLine();
			}
		}
		if(!atLeastOneLegalScore)
			throw new NumberFormatException(NO_LEGAL_SCORES_MESSAGE);
		return sum;
	}
}
