package com.danielcumberbatch.Exercise_0_7_;

import java.util.Scanner;

public class Exercise_0_7_ {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String line = null;
		if(sc.hasNextLine())  line = sc.nextLine();
		int readPos = 0, wordBeg = 0, wordEnd = 0;
		while(readPos < line.length())
		{
			while(line.charAt(readPos) == ' ')
			{
				++readPos;
				System.out.print(" ");
			}
			if(readPos < line.length())
				wordBeg = wordEnd = readPos;
			while(wordEnd < line.length() && line.charAt(wordEnd) != ' ')
				++wordEnd;
			String word = line.substring(wordBeg, wordEnd);
			if(word.equals("is"))
				System.out.print("is not");
			else
				System.out.print(word);
			readPos = wordBeg = wordEnd;
		}
	}
}
