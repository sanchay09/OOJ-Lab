import java.util.Scanner;

class BMSCE extends Thread {
	synchronized public void run() 
	{
		try 
		{
			int i=0;
			while (i<5) 
			{
				sleep(10000);
				System.out.println("BMS College of Engineering ");
				i++;
			}
		} 

		catch (Exception e) {
		}
	System.out.println("Exiting Thread 1");
	}
}

class CSE extends Thread 
	{
	synchronized public void run() 
	{
		try 
		{
			int i=0;
			while (i<5) 
			{
				sleep(2000);
				System.out.println("CSE");
				i++;
			}
		} 
		
		catch (Exception e) {
		}
	System.out.println("Exiting Thread 2");

	}
}


class Multithreading 
{
	public static void main(String args[]) 
	{
		BMSCE t1 = new BMSCE();
		CSE t2 = new CSE();
		t1.start();
		t2.start();
	}
}