import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class EMail
{      
    public static void main (String[] args) throws FileNotFoundException
    {
        new EMail().run();        
    } // method main
    
    public void run() throws FileNotFoundException
    {
        final String IN_FILE_PROMPT = "Please enter the path for the input file: ";
        
        // Declare and initialize a scanner over input from keyboard:
        Scanner keyboardScanner = new Scanner(System.in);

        System.out.print (IN_FILE_PROMPT);
        
        // Read in the name of the input file:
        String inFileName = keyboardScanner.nextLine();

        System.out.println();

        // Declare and initialize a scanner over the input file:
        Scanner fileScanner = new Scanner(new File(inFileName)); 

        // Declare, but do not initialize, a scanner over one 
        // line of text in the input file:
        Scanner lineScanner;
                
        while (fileScanner.hasNextLine())
        {
            // Initialize the line scanner to recognize an e-mail address 
            // (with the useDelimiter method):
            lineScanner = new Scanner(fileScanner.nextLine()).useDelimiter("[^a-zA-Z@._0-9]+");
            
            while (lineScanner.hasNext())
            {
                // Get the next candidate from the line scanner:
                String candidate = lineScanner.next();

                int atSignPos = candidate.indexOf ("@");
                int lastAtSignPos = candidate.lastIndexOf( "@" );
                int lastDotSignPos = candidate.lastIndexOf(".");
                if (atSignPos == lastAtSignPos && lastDotSignPos > atSignPos)
                    System.out.println (candidate);               
            } // while more candidates in current line
            lineScanner.close();
        } // while more lines left to scan
        fileScanner.close();
        keyboardScanner.close();
    } // method run
      
} // class EMail