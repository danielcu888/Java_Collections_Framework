package com.danielcumberbatch.Exercise_0_8_;

import java.util.Scanner;

public class Exercise_0_8_ {
	public static void main(String[] args)
	{
		final String INPUT_PROMPT = "\nPlease enter the input line: ";
		final String SUBSTR_PROMPT = "\nPlease enter the string to be replaced: ";
		final String REPLACE_PROMPT = "\nPlease enter the replacement string: ";

		Scanner sc = new Scanner(System.in);
		String line1 = null, line2 = null, line3 = null;
		System.out.println(INPUT_PROMPT);
		line1 = sc.nextLine();
		System.out.println(SUBSTR_PROMPT);
		line2 = sc.nextLine();
		System.out.println(REPLACE_PROMPT);
		line3 = sc.nextLine();
		
		int beg = 0, end = 0;
		while(end <= line1.length())
		{
			end = beg + line2.length();
			if(end < line1.length())
			{
				if((beg == 0 || line1.charAt(beg-1) == ' ') && (end == line1.length() || line1.charAt(end) == ' ') && line1.substring(beg, end).equals(line2))
				{
					System.out.print(line3);
					beg = end;
				}
				else
					++beg;
			}
			else
			{
				System.out.print(line1.substring(beg, line1.length()));
				end = line1.length();
			}
		}
	}
}
