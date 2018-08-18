package programming_exercise_2_1;

public class Programming_Exercise_2_1 
{
	public static boolean isEven(int i)
	{
		if(i % 2 == 0)
			return true;
		else
			return false;
	}
	
	public void run()
	{
		System.out.println(isEven(-2));
	}
	
	public static void main(String[] args)
	{
		new Programming_Exercise_2_1().run();
	}
}
