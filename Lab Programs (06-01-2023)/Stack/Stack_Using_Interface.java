/*Write Java program on Stack using Interface*/

import java.util.*;

interface stackinterface
{
	void push(int item);
	int pop();
}

class Stack implements stackinterface
{
 	Scanner sc=new Scanner(System.in);
      private int stack[ ];
      private int top;

      Stack(int size)
      {
		stack=new int[size];
		top=-1;
	}

	public void push(int item)
	{
		if(top==stack.length-1)
		{
			System.out.println("Stack Overflows");
		}

		else
		{
			stack[++top]=item;
		}
	}

	public int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflows");
			return 0;
		}
		
		else
			return stack[top--];
	}
}

class StackOperations{
	public static void main(String args[ ]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size of the Stack");
	int n=sc.nextInt();
	Stack s=new Stack(n);
             
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the value "+(i+1));
		int val=sc.nextInt();
		s.push(val);
	}

	System.out.println(" Stack Contents are.");
	for(int i=0;i<n;i++)
	{
		System.out.println(s.pop());
	}          
}
}