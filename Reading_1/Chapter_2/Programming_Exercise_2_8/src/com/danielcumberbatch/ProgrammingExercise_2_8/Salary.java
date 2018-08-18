package com.danielcumberbatch.ProgrammingExercise_2_8;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Salary 
{	
	public void findAboveAverageSalaries(Scanner sc)
	{
		final int NUM_SALARIES = 10;
		final String INPUT_PROMPT = "\nPlease enter in the ages: ";
		final String INVALID_PROMPT = "\nInvalid data, please try again...";
		final String NO_VALID_DATA_MSG = "No valid entries!";
		final String LESS_THAN_TWO_ENTRIES_MSG = "Only one entry was entered!";
		
		final double SENTINEL = -1.0;
		final double DELTA = 0.0001;
		
		double[] salaries = new double[NUM_SALARIES];
		int count = 0;
		
		while(sc.hasNext() && count < salaries.length)
		{
			double tmp = 0.0;
			try {
				System.out.println(INPUT_PROMPT);
				tmp = sc.nextDouble();
				if(tmp < 0.0 || Math.abs(tmp - 0.0) < DELTA)
					throw new IOException();
				if(Math.abs(tmp - SENTINEL) < DELTA)
					break;
				salaries[count++] = tmp;
			} catch(InputMismatchException mme) {
				System.out.println(INVALID_PROMPT);
				sc.nextLine();
			} catch(IOException ioe) {
				System.out.println(INVALID_PROMPT);
				sc.nextLine();
			}
		}
		
		if(count == 0)
			throw new NumberFormatException(NO_VALID_DATA_MSG);
		if(count == 1)
			System.out.println(LESS_THAN_TWO_ENTRIES_MSG);
		else
		{
			double average = 0.0;
			for(int i = 0; i != count; ++i)
				average += salaries[i];
			average/=count;
			for(int i = 0; i != count; ++i)
				if(salaries[i] > average) 
					System.out.println(salaries[i]);
		}
	}
	
	public void run()
	{	
		Scanner keyBoardScanner = new Scanner(System.in);
				
		try {
			findAboveAverageSalaries(keyBoardScanner);
		} catch(NumberFormatException nfe) {
			System.out.println(nfe);
		}
	}
	
	public static void main(String[] args)
	{
		new Salary().run();
	}
}
