import java.util.Scanner; 

class Student
{
	Scanner sc = new Scanner(System.in); 
	String USN;
	String Name; 
	float Marks; 
	static int i=1;

	public void input()
	{
		System.out.print("\nEnter Student "+i+" usn: "); 
		USN = sc.next();
		System.out.print("Enter Student "+i+" name: "); 
		Name = sc.next();
		System.out.print("Enter Student "+i+" marks: "); 
		Marks = sc.nextFloat();
		i++;
	}

	public void display(Student stud)
	{
		System.out.println("\nStudent Details: ");
		System.out.print("\nUSN: " +stud.USN); 
		System.out.print("\nName: "+stud.Name); 
		System.out.print("\nMarks: "+stud.Marks);
	}
}


class StudentDetails{
	public static void main(String[] args){
	
	Student stud1 = new Student(); 
	Student stud2 = new Student(); 

	stud1.input();
	stud2.input(); 

		if((stud1.Marks)>(stud2.Marks))
		{
			stud1.display(stud1);
		}

		else
		{
			stud2.display(stud2);
		}
	}
}