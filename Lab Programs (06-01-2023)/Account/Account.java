/*Write a Java program to create an account class. Define appropriate constructor for this
class. Implement separate methods to display account balance and withdraw money.
Raise a user defined exception if there is an attempt to withdraw money which is greater
than the account balance. Make necessary assumptions required.*/

import java.util.*;
import java.lang.Exception;

class MyaccountException extends Exception
{
	public String toString()
	{
		return "Balance is Less,please update it and withdraw";}
	}

	class account
	{
		Scanner sc=new Scanner(System.in);
		String name;
		double bal;
 
		account()
		{
			System.out.println("Enter Your Name");
			name=sc.next();
			System.out.println("Enter the Balance Amount");
			bal=sc.nextDouble();
		}

		public void withdraw() throws MyaccountException
		{
			System.out.println("Enter the amount to widthdraw");
			double amt=sc.nextDouble();

			if(amt>bal)
			{
				throw new MyaccountException();
			}

			bal=bal-amt;
			System.out.println("Amount Withdrawn "+amt);
			System.out.println("Balance "+bal);
		}


		public void deposit() 
		{
			System.out.println("Enter the amount to deposit");
			double amt=sc.nextDouble();

			bal=bal+amt;
			System.out.println("Amount deposited "+amt);
			System.out.println("Balance "+bal);
		}

	}

class AccountDetails{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	account a=new account();

  
	System.out.println("\n1. Deposit");
	System.out.println("2. Withdraw");
	System.out.println("\nEnter your Choice: ");
	int choice=sc.nextInt();

	switch(choice)
	{
		case 1:a.deposit();
			 break;

		case 2: 
			try
			{
				a.withdraw();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			break;

		default:System.out.println("Enter the corrct choice");

		}
	}
}