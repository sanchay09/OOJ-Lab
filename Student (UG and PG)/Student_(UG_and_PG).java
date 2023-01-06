import java.util.*;

interface resultt
{
	void generate_result();
}

class Student
{
	String s_name;
	int t_score;
	String t_result;
	int marr[]=new int[4];
	double avg=0;
	int flag=1;
	Student(){}

	Student(String s)
	{
		s_name=s;
	}

	void set_test_score(int t_no,int t_score)
	{
		marr[t_no]=t_score;
	}


	void set_studname(String s)
	{
		s_name=s;
	}


	void set_tresult()
	{
		for(int j=0;j<4;j++)
		{
 			avg+=marr[j];
		}
		avg=avg/4;
	}

	double get_tscore()
	{
		set_tresult();
		return avg;
	}

	String get_tresult()
	{
		String p="pass",f="fail";
		if(flag==1)
		{
			return p;
		}
		else return f;
	}


	String get_studname()
	{
		return s_name;

	}
}


class Ug extends Student implements resultt
{
	Ug(){}

	Ug(String s)
	{
		s_name=s;
	}

	public void generate_result()
	{
		double q=get_tscore();
		if(q<60) 
		{ 
			flag=0;
		}

		System.out.println("name"+" "+get_studname());
		System.out.println("result"+" "+get_tresult());
	}
}


class Pg extends Student implements resultt
{
	Pg(){}

	Pg(String s)
	{
		s_name=s;
	}

	public void generate_result()
	{
		double q=get_tscore();

		if(q<70) 
		{ 
			flag=0;
		}

		System.out.println("name"+"     "+get_studname());
		System.out.println("result"+"     "+get_tresult());
	}

}


class Tester
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		Ug o2=new Ug();
		Pg o3=new Pg();

		System.out.println("enter ug student name");
		String na=sc.next();

		o2.set_studname(na);

		System.out.println("enter marks of all 4 tests");
		for(int i=0;i<4;i++)
		{
			int m=sc.nextInt();
			o2.set_test_score(i,m);
		}

		o2.generate_result();

		System.out.println("enter pg student name");
		String nb=sc.next();

		o3.set_studname(nb);

		System.out.println("enter marks of all 4 tests");
		for(int i=0;i<4;i++)
		{
			int m=sc.nextInt();
			o3.set_test_score(i,m);
		}

		o3.generate_result();
	}
}