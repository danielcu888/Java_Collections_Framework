package otherPackage;
import APackage.A;

public class D extends A
{
	public void meth()
	{
		D d = new D();
		d.t = 1;
		t = 2;
		A a = new A();
		a.t = 3;
		
		C c = new C();
		c.t = 4;
		
		E e = new E();
		e.t = 9;
	}
}

class E extends A
{
	
}

class F extends D
{
	public foo()
	{
		D d = new D();
		d.t = 6;
	}
}