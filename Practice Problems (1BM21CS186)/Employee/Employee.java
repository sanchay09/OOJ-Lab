import java.util.Scanner; 

class Employee
	{
		Scanner sc = new Scanner(System.in); 
		int empID,numberOfHours;
		String empName;
		float empBasic, empHRA, empDA, empIncomeTax, gross; 

	public void input()
	{
		System.out.print("\nEnter the Employee ID: "); 
		empID = sc.nextInt();

		System.out.print("Enter the Employee Name: "); 
		empName = sc.next();

		System.out.print("Enter the Number of Work Hours: "); 
		numberOfHours = sc.nextInt();

		System.out.print("Enter the Basic Salary: "); 
		empBasic = sc.nextFloat();

		System.out.print("Enter the House Rent Allowance in %: "); 
		empHRA = sc.nextFloat();

		System.out.print("Enter the Dearness Allowance in %: "); 
		empDA = sc.nextFloat();

		System.out.print("Enter the Income Tax %: "); 
		empIncomeTax = sc.nextFloat();
	}

	public void calculate()
	{
		float overtime = overtime(); 
		gross = empBasic + ((empBasic*empHRA)/100f)+((empBasic*empDA)/100f)-((empBasic*empIncomeTax)/100f); 
		gross=gross+overtime;
	}

	public float overtime()
	{
		float sum=0f;
 
		if(numberOfHours<200)
		{
			sum=sum-(numberOfHours*100);
		}

		else
		{
			sum=sum-(numberOfHours*100);
		}

	return sum;
	}

	public void display()
	{
		System.out.println("\nHouse Rent Allowance of the Employee: "+(empBasic*empHRA)/100f);
		System.out.println("\nDearness Allowance of the Employee: "+(empBasic*empDA)/100f);
		System.out.println("\nIncome Tax of the Employee: "+(empBasic*empIncomeTax)/100f);
		System.out.println("\nGross Income of the Employee: "+gross);
	}
}

class EmployeeDetails{
	public static void main(String args[]){

	Employee emp = new Employee(); 
	emp.input();
	emp.calculate(); 
	emp.display();
}
}
