import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HighestGPA {
	public void run() throws FileNotFoundException {
		final double NEGATIVE_GPA = -1.0;
		final String NO_VALID_INPUT = "Error: the given file has no valid input";
		final String BEST_MESSAGE = "\n\nThe student with the highest gpa is: ";
		final String IN_FILE_PROMPT = "Please enter the path for the input file: ";
		
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print(IN_FILE_PROMPT);
		String inFileName = keyboardScanner.nextLine();
		
		//Scanner fileScanner = new Scanner(new File("/Users/danielcumberbatch/Documents/eclipse_wkspace/Java/DataStructuresAndTheJCF/Chapter0/HighestGPA/src/students.dat"));
		Scanner fileScanner = new Scanner(new File(inFileName));
		String name, bestStudent = null;
		double gpa, highestGPA = NEGATIVE_GPA;
		while (fileScanner.hasNextLine()) {
			name = fileScanner.next();
			gpa = fileScanner.nextDouble();
			if (gpa > highestGPA){
				highestGPA = gpa;
				bestStudent = name;
			} // if
		} // while
		if (highestGPA == NEGATIVE_GPA)
			System.out.println(NO_VALID_INPUT);
		else
			System.out.println(BEST_MESSAGE + bestStudent);
		fileScanner.close();
		keyboardScanner.close();
	} // method run
	
	public static void main(String args[]) throws FileNotFoundException {
		new HighestGPA().run();
	} // method main
} // class HighestGPA
