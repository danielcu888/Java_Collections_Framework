package com.danielcumberbatch.Section_3_1;

public class Section_3_1 
{
	
	/**
	 * returns the number of entries in the specified array
	 * of doubles that possess a value greater than the mean 
	 * of that array.
	 * 
	 * @param a - specified array of doubles
	 * 
	 * @return the number of entries in the specified array
	 * of doubles that possess a value greater than the mean 
	 * of that array.
	 * 
	 */
	public static double aboveMeanCounts(double a[])
	{
		if(a.length == 0) return 0.0;
		double mean = 0.0;
		for(double d : a)
			mean += d;
		mean /= a.length;
		int count = 0;
		for(double d : a)
			if(d > mean) 
				++count;
		return count;
	} // method aboveMeanCount
	
	/**
	 * Returns the index of the specified sorted array of integers at which the
	 * specified integer value is located, or -1 if the value is not found.
	 * 
	 * @param a - specified sorted array (in ascending order) of integer values
	 * @param val - specified integer value
	 * @param low - minimum index to be searched
	 * @param high - maximum index to be searched
	 * @return the index of the specified sorted array of integers at which the
	 * specified integer value is located, or -1 if the value is not found.
	 * 
	 */
	public static int binarySearch(int a[], int val, int low, int high)
	{
		while(low <= high)
		{
			int mid = (low + high)/2;
			if(a[mid] == val) 
				return mid;
			else if(a[mid] < val)
				return binarySearch(a, val, low, mid - 1);
			else
				return binarySearch(a, val, mid + 1, high);
		}
		return -1;
	} // method binarySearch
	
	/**
	 * sorts the contents of the specified array of integers into ascending
	 * order.
	 * 
	 * @param a - the specified array of integers
	 */
	public static void selectionSort(int a[])
	{
		for(int k = 0; k != a.length; ++k)
		{
			int min_idx = k;
			int min = a[k];
			
			for(int i = k; i != a.length; ++i)
				if(a[i] < min)
				{
					min_idx = i;
					min = a[i];
				}
			int tmp = a[k];
			a[k] = a[min_idx];
			a[min_idx] = tmp;
		}
	} // method selectionSort
}
