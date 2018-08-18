package com.danielcumberbatch.Programming_Exercise_2_9;

public class Programming_Exercise_2_9 {
	public static void main(String[] args)
	{
		int[] a1 = {1,2,3,4,5,6,7,8,9,10};
		int[] a2 = {10,9,8,7,6,5,4,3,2,1};
		System.arraycopy(a1, 3, a2, 5, 2);
		for(int i : a2)
			System.out.print(i + " ");
		System.out.println();
	}
}
