package com.danielcumberbatch.programmingexercise211;

import java.text.DecimalFormat;

class FullTimeEmployee
{
	final static DecimalFormat MONEY = new DecimalFormat("#,###.00");
	
	public FullTimeEmployee()
	{
		name = "";
		grossPay = 0.0;
	}
	
	public FullTimeEmployee(String name_, double grossPay_)
	{
		name = name_;
		grossPay = grossPay_;
	}
	
	double grossPay;
	String name;
	
	public boolean equals(Object obj)
	{
		if(!(obj instanceof FullTimeEmployee))
			return false;
		FullTimeEmployee full = (FullTimeEmployee) obj;
		return name.equals(full.name) && MONEY.format(grossPay).equals(MONEY.format(full.grossPay));
	}
}

public class Programming_Exercise_2_11 
{
	public static void main(String[] args)
	{
		FullTimeEmployee f1 = new FullTimeEmployee("Dan", 1.0);
		FullTimeEmployee f2 = new FullTimeEmployee("Jo", 1.0);
		FullTimeEmployee f3 = new FullTimeEmployee("Jo", 1.0);
		FullTimeEmployee f4 = new FullTimeEmployee("Jo", 1.0);
		
		//reflexivity	
		System.out.println(f1.equals(f1));
		
		//symmetry
		System.out.println(f1.equals(f2) == f2.equals(f1));
		
		//transivity
		System.out.println(f2.equals(f3) == f3.equals(f4) == f2.equals(f4));
		
		//consistency
		System.out.println(!f1.equals(f2));
		System.out.println(!f1.equals(f2));
		
		//actuality
		System.out.println(!f1.equals(null));
	}
}
