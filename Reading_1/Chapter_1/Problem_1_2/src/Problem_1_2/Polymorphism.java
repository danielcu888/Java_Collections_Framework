package Problem_1_2;

import java.util.Scanner;

class A
{
	public String toString()
	{
		return "A";
	} //method toString
} // class A

class D extends A
{
	public String toString()
	{
		return "D";
	} //method toString
} //class D

public class Polymorphism 
{
	public static void main(String[] args)
	{
		new Polymorphism().run();
	} // method main
	
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		A a;
		int code = sc.nextInt();	
		a = (code == 0) ? new A() : new D();
		System.out.println(a);
	} //method run
} // class Polymorphism
