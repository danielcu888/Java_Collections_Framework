package com.danielcumberbatch.Exercise_0_9_;

public class Exercise_0_9_ {
	public static void main(String[] args)
	{
		new Exercise_0_9_().run();
	}
	
	public void run()
	{
		for(int i = 0; i != 100; ++i)
			mystery(i);
	}
	
	public void mystery(int n)
	{
		System.out.print("For n = " + n);
		while(n > 1)
			if(n % 2 == 0)
				n /= 2;
			else
				n = 3*n + 1;
		System.out.println(", the loop terminated.");
	}
}
