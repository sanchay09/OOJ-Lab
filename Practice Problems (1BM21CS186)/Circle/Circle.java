import java.util.*;


abstract class Shape {

int a;

public Shape(int a) {
    this.a = a;
	}
	abstract void Printarea();
	abstract void PrintPerimeter();
	}

class Circle extends Shape {

    Circle(int a) {
        super(a);
    }

    void Printarea() {
        System.out.println("area of circle is " + (3.14 * a * a));
    }
	
    void PrintPerimeter(){
	System.out.println("area of circle is " + (2 * 3.14 * a));
    }

}


class Main {
public static void main(String args[]) {

	Scanner in = new Scanner(System.in);

	System.out.println("Enter dimension 1: ");
	int x = in.nextInt();

    Shape b;
    b = new Circle(x);
    b.Printarea();
    b.PrintPerimeter();
}
}