import java.util.Scanner; 

class TimeDemo
{
	int h,m,h1,m1;
	int hours=0,minutes=0; 
	TimeDemo(){}

	TimeDemo(int h,int m)
	{
		this.h = h;
		this.m = m;
		add(h,m);
	}

	public void accept(int h,int m)
	{
		this.h1 = h; 
		this.m1 = m; 
		add(h1,m1);
	}

	public void add(int h,int m)
	{
		int c; 
		hours+=h; 
		minutes+=m; 

		if(minutes>59)
		{
			c = minutes/60; 
			hours+=c;
			c = minutes%60; 
			minutes =c;
		}
	}

	public void display()
	{
		System.out.println("\nTime 1: "+h+" hours , "+m+" minutes"); 
		System.out.println("Time 2: "+h1+" hours , "+m1+" minutes"); 
		System.out.println("Time 3: "+hours+" hours , "+minutes+"minutes");
	}
}

class Time{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in); 

	TimeDemo t = new TimeDemo(11,50); 

	int h,m;

	System.out.print("\nEnter the Hours: "); 
	h = sc.nextInt();

	System.out.print("Enter the Minutes: "); 
	m = sc.nextInt();

	t.accept(h,m);
	t.display();
	}
}