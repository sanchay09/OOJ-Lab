import java.util.*;

class QuadraticEquation{
	
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
		double a = sc.nextDouble();

 		System.out.println("Enter value of b: ");
		double b = sc.nextDouble();

		System.out.println("Enter value of c: ");
		double c = sc.nextDouble();

		double d = (b*b)-(4*a*c);

		if (d>0)
		{
			double r1 = (-b+Math.sqrt(d))/(2*a);
			double r2 = (-b-Math.sqrt(d))/(2*a);
			System.out.println("\nRoots are Real and Unequal\n");
			System.out.format("Root 1: %.2f\n", r1);
			System.out.format("Root 2: %.2f\n", r2);
		}

		else if (d==0)
		{
			double r1,r2;
			r1= r2 = -b/(2*a);
			System.out.println("\nRoots are Real and Equal\n");
			System.out.format("Root 1 = Root 2 = %.2f\n", r1, r2);
		}

		else
		{
			double real = -b / (2 * a);
    			double imaginary = Math.sqrt(-d) / (2 * a);
			System.out.println("\nRoots are Imaginary\n");
      		System.out.format("Root1 = %.2f+%.2fi\n", real, imaginary);
     			System.out.format("Root2 = %.2f-%.2fi\n", real, imaginary);
			
		}
		sc.close();
}
}