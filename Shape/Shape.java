/*Develop a Java program to create an abstract class named Shape that contains two integers and an empty method named printArea( ). 
Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class Shape. 
Each one of the classes contains only the method printArea( ) that prints the area of the given shape.*/

import java.util.*;


abstract class Shape {

int a, b;

public Shape(int a, int b) {
    this.a = a;
    this.b = b;
	}
	abstract void Printarea();
	}

class Circle extends Shape {

    Circle(int a, int b) {
        super(a, b);
    }

    void Printarea() {
        System.out.println("area of circle is " + (3.14 * a * a));
    }

}

class Rectangle extends Shape {
 public Rectangle(int a, int b) {
    super(a, b);
}

void Printarea()
{
    System.out.println("area of rectangle is " + (a * b));
}

}

class Triangle extends Shape {
public Triangle(int a, int b) {
    super(a, b);
}

void Printarea()

{

    System.out.println("area of triangle is " + (0.5 * a * b));

}

}

class Main {
public static void main(String args[]) {

	Scanner in = new Scanner(System.in);

	System.out.println("Enter dimension 1: ");
	int x = in.nextInt();
	System.out.println("Enter dimension 2: ");
	int y = in.nextInt();


    Shape b;
    b = new Circle(x, y);
    b.Printarea();
    
    b = new Rectangle(x, y);
    b.Printarea();

    b = new Triangle(x, y);
    b.Printarea();
}
}