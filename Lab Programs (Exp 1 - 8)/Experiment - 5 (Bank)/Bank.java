import java.util.Scanner;

class Account
{
	String name;
	int type;
	long accno;
	double balance;
	void setA()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Customer Name: ");
		name=s.nextLine();
		
		System.out.print("Enter Account number: ");
		accno=s.nextLong();
		System.out.println("Account Balance Should Not Be Less than 5000!!!!");
		System.out.print("Enter Bank Balance: ");
		balance=s.nextDouble();
	}

	void display()
	{
		System.out.println("Customer Name is: "+name);
		if(type==1) {
			System.out.println("Customer Account Type is: Savings");
		}
		else {
			System.out.println("Customer Account Type is: Current");
		}
		System.out.println("Customer Account Number is: "+accno);
		System.out.println("Current Balance is: "+balance);
	}
	void deposit()
	{
		System.out.print("Enter the Amount to be Deposited: ");
		Scanner x=new Scanner(System.in);
		double amt=x.nextDouble();
		balance+=amt;
		System.out.println("Updated Balance: "+balance);
	}	
}


class Sav_acct extends Account
{
	double interest;
	Scanner s=new Scanner(System.in);
	
	Sav_acct() {
		type=1;
	}
	void cinterest()
	{
		int timey;
		float irate;
		int times;
		System.out.println("Compound Interest details:");
		
		System.out.println("Enter Time in Years: ");
		timey=s.nextInt();
		System.out.println("Enter Rate of Interest: ");
		irate=s.nextFloat();
		System.out.println("Enter Number of Times: ");
		times=s.nextInt();
		System.out.println("Interest will be Compunded "+times+" times a year");
		interest=balance*(Math.pow((1+irate/times),(times*timey)));
		balance+=interest;
		System.out.println("Balance:"+balance);
	}
	void withdraw()
	{
		System.out.println("Enter the Amount to be Withdrawn: "); 
		double amt=s.nextDouble();
		if(balance>amt)
		{balance-=amt;
			System.out.println("Updated Balance: "+balance);
		}
		else
		{System.out.println("Amount to be withdrawn greater than balance!!!");
			balance=balance-(balance/10);
			System.out.println("10% penalty has been charged!!!");
			System.out.println("Updated Balance: "+balance);
		}
	}

}

class Curr_acct extends Account
{
	double check_amt;

	Curr_acct() {
		type=2;
	}
	
	void cheque()
	{
		System.out.print("Enter the cheque amount: "); 
		Scanner s=new Scanner(System.in);
		check_amt = s.nextDouble();
		if(check_amt>balance) 
		{
			System.out.println("Rs. 500 penalty imposed...Is it ok to proceed? Enter y for yes and n for no"); 
			String option=s.next();
			if(option.equals("y")) 
				{balance=balance-500;}
			else {System.out.println("no Check debited");}
		}
		else
		{
			System.out.println("Rupees "+check_amt+" debited"); 
			balance-=check_amt;
			System.out.println("Updated Balance: "+balance);
		}
	}
	void withdraw()
	{
		System.out.println("Enter the amount to be withdrawn: "); 
		Scanner s=new Scanner(System.in);
		double amt=s.nextDouble();
		if(balance>amt)
		{balance-=amt;
			System.out.println("Updated Balance: "+balance);
		}

		else
		{	System.out.println("Amount to be withdrawn greater than balance!!!");
			balance=balance-(balance/10);
			System.out.println("10% penalty has been charged!!!");
			System.out.println("Updated Balance: "+balance);}
	}
}

class Bank {
	public static void main(String ss[]) {
		String op1,op2;
		Scanner s=new Scanner(System.in);
		System.out.println("1. Savings or   2. Current");
		int q;
		q=s.nextInt();
		if(q==1) {
			Sav_acct s1 = new Sav_acct();
			while(true) {
			System.out.print("\n1. Set the values for Savings Account\n2. Display\n3. Deposit\n4. Interest\n5. Withdraw\n6. Exit\n Cheque Facility Not Available!!\n");
			System.out.println("Enter the choice: ");
			op1=s.next();
			switch(op1)
			{
			case "1":s1.setA();
				  break;
			case "2":s1.display();
				  break;
			case "3":s1.deposit();
				  break;
			case "4":s1.cinterest();
				  break;
			case "5":s1.withdraw();
				  break;
			case "6":System.exit(0);
			}
			}
		}
		else if(q==2) {
			Curr_acct c1 = new Curr_acct();
			while(true) {
			System.out.print("\n1. Set the values for current account\n2. Display\n3. Deposit\n4. Cheque Facility\n5. Withdraw\n6. Exit\n");
			System.out.println("Enter your Choice: ");
			op2=s.next();
			switch(op2)
			{
			case "1":c1.setA();
				  break;
			case "2":c1.display();
				  break;
			case "3":c1.deposit();
				  break;
			case "4":c1.cheque();
				  break;
			case "5":c1.withdraw();
				  break;
			case "6":System.exit(0);
			}
			}
		}
	}
}