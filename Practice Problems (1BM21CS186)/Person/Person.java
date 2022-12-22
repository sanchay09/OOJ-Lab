import java.util.Scanner; 

class Person
{
	String name; 
	int age;
}

class Patient extends Person
{
	Scanner sc = new Scanner(System.in); 
	int pid;
	String doctorName;

	public void input()
	{
		System.out.print("\nEnter the Patient name: "); 
		name = sc.next();

		System.out.print("Enter the Patient ID: "); 
		pid = sc.nextInt();

		System.out.print("Enter the Patient Age: "); 
		age = sc.nextInt();

		System.out.print("Enter the Doctor name: "); 
		doctorName = sc.next();
	}

	public void display()
	{
		System.out.println("\nPatient Details\n"); 
		System.out.println("Patient name: "+name); 
		System.out.println("Patient ID: "+pid); 
		System.out.println("Patient Age: "+age); 
		System.out.println("Doctor name: "+doctorName);
	}
}

class PatientDetails{
public static void main(String args[]){

	Patient p = new Patient(); 
	p.input();
	p.display();

	}
}
