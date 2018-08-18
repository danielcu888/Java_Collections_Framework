package com.danielcumberbatch.programming_project_2_12;

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

