/* Write a program that creates a user interface to perform integer divisions. The user enters two numbers in the 
text fields, Num1 and Num2. The division of Num1 and Num2 is displayed in the Result field when the Divide button 
is clicked. If Num1 or Num2 were not an integer, the program would throw a NumberFormatException. If Num2 were Zero, 
the program would throw an Arithmetic Exception. Display the exception in a message dialog box.*/

import java.util.Scanner;

interface abc
{
    public int calc(int a,int b);
}

class pqr implements abc
{
    public int calc(int a, int b)
    {
        int c = a/b;
        return c;
    }
}

class Divide
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        pqr obj = new pqr();
        int num1,num2;

        try
        {
            System.out.println("Enter the two numbers: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            int c = obj.calc(num1,num2);
            System.out.println("Division Result: "+c);
        }

        catch(ArithmeticException | NumberFormatException e)
        {
            System.out.println("Exception: "+e);
        }
    }
}


