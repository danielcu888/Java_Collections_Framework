import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_0_7 
{
	public static void replace(String s1, String s2, String s3)
	{
		int idx = 0;		
		while(idx < s1.length())
		{
			int mk = s1.indexOf(s2, idx);
			if(mk == -1) 
				{
					System.out.println(s1.substring(idx));
					return;
				}
	
			if(mk == 0)
			{
				if(s1.charAt(mk + s2.length()) == ' ')
					System.out.print(s1.substring(idx, mk) + s3);
				else
					System.out.print(s1.substring(idx, mk) + s2);
			}
			else if(mk == s1.length()-s2.length())
			{
				if(s1.charAt(s1.length()-s2.length()-1) == ' ')
					System.out.print(s1.substring(idx, mk) + s3);
				else
					System.out.print(s1.substring(idx, mk) + s2);
			}
			else if(s1.charAt(mk-1) == ' ' && s1.charAt(mk+s2.length()) == ' ')
			{
				System.out.print(s1.substring(idx, mk) + s3);
			}
			else
			{
				System.out.print(s1.substring(idx, mk) + s2);
			}
			
			idx = mk + s2.length();
		}
	}
	
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			line = br.readLine();
		} catch(IOException exc){
			System.out.println("I/O Exception " + exc);
		}
		replace(line, "is", "is not");
	}
}
