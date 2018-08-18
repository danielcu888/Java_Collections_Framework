package scores1;

import java.util.*;

public class Scores1 
{
	public static final int SENTINEL = -1;
	
	public static void main(String[] args)
	{
		new Scores1().run();
	} //main method
	
	
	public void run()
	{
		final String INPUT_PROMPT = "\nOn each line, enter a test score (or " + SENTINEL + " to quit): ";
		final String RESULT = "\n\nThe sum of the scores is: ";
		
		System.out.println(INPUT_PROMPT);
		
		Scanner sc = new Scanner(System.in);
		
		int sum = addScores(sc);
		
		System.out.println(RESULT + sum);
	} // method run
	
	public int addScores(Scanner sc)
	{
		int sum = 0;
		while(sc.hasNext())
		{
			int score = sc.nextInt();
			if(score == SENTINEL)
				break;
			sum += score;
		} //while
		return sum;
	} // method addScores
}
