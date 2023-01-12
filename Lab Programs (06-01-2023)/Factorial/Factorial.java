/*Write a Java program to compute the factorial of a number. The input value must be
tested for validity. If it is greater than 15, the method ComputeFactorial( ) should raise an
Userdefined Exception MyFactorialException with appropriate messages.*/

import java.util.*;
import java.lang.Exception;

class MyFactorialException extends Exception{
	public String toString()
	{
		return "Error,It can't be greater than 15!!";}
	}

	class factorial
	{
		public int ComputeFactorial(int n) throws MyFactorialException
		{
		int fact=1;

		if(n>15)
		{
 			throw new MyFactorialException();
 		}

		else
		{
 			for(int i=n;i>0;i--)
			{
				fact*=i;
			}
 
		}

		return fact;
	}
}

class Exception2{
	public static void main(String args[]){
	factorial f=new factorial();
      
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number to find the factorial");
	int n=sc.nextInt();

	try
	{
		System.out.println("The factorial of "+n+" is "+f.ComputeFactorial(n));
	}

	catch(Exception e)
	{
		System.out.println(e);
	}
}
}