import java.util.Scanner;

abstract class Calculation
{
    double a, b, result;
    abstract void calc();
}

class Add extends Calculation
{
    void calc()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        result = (a+b);
        System.out.println("\nAddition: "+result+"\n");
    }
}

class Multiply extends Calculation
{
    void calc()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        result = a*b;
        System.out.println("\nMultiplication: "+result+"\n");
    }
}

class Subtract extends Calculation
{
    void calc()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        result =(a-b);
        System.out.println("\nSubtraction: "+result+"\n");
    }
}

class Operations
{
    public static void main(String args[])
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("\n1.Addition\n2.Multiplication\n3.Subtraction\n4.Exit");
		System.out.println("\n\nEnter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1: Add a = new Add();
                        a.calc();
                        break;
                case 2: Multiply m = new Multiply();
                        m.calc();
                        break;
                case 3: Subtract sb = new Subtract();
                        sb.calc();
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