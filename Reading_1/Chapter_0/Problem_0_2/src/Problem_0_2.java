public class Problem_0_2 
{
	public static void main(String[] args)
	{
		int a = 37, b = 5;
		
		System.out.println(a - a / b * b - a % b); //is equivalent to...
		System.out.println(a - ((a / b) * b) - (a % b));
		
		//Nope
	}
}