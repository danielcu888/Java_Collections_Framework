package programming_exercise_2_5;

/*class String
{
	public static String valueOf(Object obj)
	{
		return (obj == null) ? "null" : obj.toString();
	}
	
	public String toString()
	{
		return this;
	}
	
	***Note that this works because println(String)
	prints the string produced by String.valueOf(Object)
	NOT String.toString()***
}
*/

public class Programming_Exercise_2_5 {
	public static void main(String[] args) 
	{
		String s;
		System.out.println(null + "null");
	}
}
