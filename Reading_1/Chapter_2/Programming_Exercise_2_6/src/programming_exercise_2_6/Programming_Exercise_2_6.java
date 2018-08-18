package programming_exercise_2_6;

import programming_exercise_2_6_pt2.*;
import programming_exercise_2_6_pt3.*;

class A
{
	int a = 1;
	private int b = 2;
	protected int c = 3;
}

class B
{
	public B()
	{
		tmp = new A();
		a = tmp.a;
		b = tmp.b;
	}
	
	A tmp;
	int a, b;
}

class C extends D
{
	public C()
	{
		c = a;
		d = b; //not visible because default values only seen within same package
	}
	
	int c, d;
}

class F
{
	public F()
	{
		E e = new E();
		e.a = 2;
		e.b = 4; //protected member not visible for non-subclass non-package member
	}
	
	E tmp;
	int a,b;
}

public class Programming_Exercise_2_6 
{
	public static void test1()
	{
		A tmp1 = new A();
		B tmp2 = new B();		
	}
	
	public static void test2()
	{
		
	}
	
	public static void main(String[] args)
	{
	}
}
