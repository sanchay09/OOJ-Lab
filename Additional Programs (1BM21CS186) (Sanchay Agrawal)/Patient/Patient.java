import java.util.*;

class Patient{
	Scanner sc = new Scanner(System.in);
	int pat_id[] = new int[30];
	String pat_name[] = new String[30];
	int pat_age[] = new int[30];
	String doc[] = new String[30];

void input(int np){
	for(int i=1; i<=np; i++){
		System.out.println("enter the details of "+i +" patients");

		System.out.println("Enter the patient id:");
		this.pat_id[i] = sc.nextInt();

		System.out.println("Enter the patient name:");
		this.pat_name[i] = sc.next();

		System.out.println("Enter the patient age:");
		this.pat_age[i] = sc.nextInt();

		System.out.println("Enter the doctor name of patient being treated:");
		this.doc[i] = sc.next();
	}
}

void display(int np){
       for(int i=1; i<=np; i++){
        System.out.println("Details of patient "+i);
        System.out.println("patient id: "+this.pat_id[i]);
        System.out.println("patient name: "+this.pat_name[i]);
        System.out.println("patient age : "+this.pat_age[i]);
        System.out.println("treated doctor name : "+this.doc[i]);
        System.out.println(" ");
}
}

void displaypt(int np)
{
	int id;
	System.out.println("\nEnter patient id: ");
	id = sc.nextInt();

for(int i=1; i<=np; i++)
    {
        if(id == pat_id[i])
        {
            System.out.println("Details of patient "+i);
            System.out.println("patient id: "+this.pat_id[i]);
            System.out.println("patient name: "+this.pat_name[i]);
            System.out.println("patient age : "+this.pat_age[i]);
            System.out.println("treated doctor name : "+this.doc[i]);
            System.out.println(" ");
        }
    }
}

void docpt(int np)
{
    String docn;
    System.out.println("enter doctor name: ");
    docn = sc.next();
    for(int i=1; i<=np; i++)
    {
        if(docn.equals(this.doc[i]))
        {
            System.out.println("patient name: "+this.pat_name[i]);
        }
 
    }

}

}

class hospital{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Patient p = new Patient();

        System.out.println("Enter the no of patients: ");
        int np = sc.nextInt();
        p.input(np);

        do
        {
        	System.out.println("\n1.Display details of all patients\n2.Display details from patient id\n3.Display details from Doctor name\n4.Exit the program?");
            System.out.println("\n\nEnter your choice: ");
            int choice = sc.nextInt();

            switch(choice)
        	{
            case 1: p.display(np);
                    break;

            case 2: p.displaypt(np);
                    break;

            case 3: p.docpt(np);
                    break;

            case 4: System.out.println("Exiting the program!");
                    System.exit(0);
                    break;

            default: System.out.println("\nInvalid Choice!\n");
       	}
        }

	while(true);
    }
}