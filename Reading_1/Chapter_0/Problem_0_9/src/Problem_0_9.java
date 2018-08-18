public class Problem_0_9 
{
	public static int mystery(int n)
	{
		System.out.print("For n = " + n + ", mystery = ");
		while(n > 1)
			n = n % 2 == 0 ? n/2 : 3*n + 1;
		return n;
	}
	
	public static void main(String[] args)
	{
		for(int i = 1; i <= 100; ++i)
			System.out.println(mystery(i));
	}
}
