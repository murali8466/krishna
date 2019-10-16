package org.cap.app;

import java.util.Scanner;

public class IncomeTax {
	double taxAmount;
	double salary;
	
	public double calculateTax(double salary)
	{
		if(salary>0 && salary<=180000)
		{
			taxAmount=0;
		}
		else if(salary>181001 && salary<=300000)
		{
			taxAmount=(salary)*0.1;
		}
		else if(salary>300001 && salary<=500000)
		{
			taxAmount=(salary)*0.2;
		}
		else if(salary>500001 && salary<=1000000)
		{
			taxAmount=(salary)*0.3;
		}
		return taxAmount;
	}
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the salary u get");
		double sal=scanner.nextDouble();
		IncomeTax incomeTax=new IncomeTax();
		System.out.println("u r tax amount is"+" "+incomeTax.calculateTax(sal));
		scanner.close();
	}

}
