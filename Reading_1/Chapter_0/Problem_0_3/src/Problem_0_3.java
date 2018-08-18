public class Problem_0_3 
{
	public static void main(String[] args)
	{
		System.out.println(1/0); //infinity not defined for ints, hence throws ArithmiticException
		System.out.println(1.0/0); //Infinity defined for floating point variables, writes infinity
	}
}
