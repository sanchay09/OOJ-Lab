/*Write Java program on Queues using Interface*/

import java.util.*;

interface queueinterface
{
	void enqueue(int item);
	int dequeue();
}

class Queue implements queueinterface
{
	Scanner sc=new Scanner(System.in);
	private int queue[ ];
	private int front;
	private int rear;

	Queue(int size)
	{
		queue=new int[size];
		front=-1;
		rear=-1;
	}

	public void enqueue(int item)
	{
		if(rear==queue.length-1)
		{
			System.out.println("Queue Overflows");
		}

		else
		{
			queue[++rear]=item;
		}
	}

	public int dequeue()
	{
		if((front > rear))
		{
			System.out.println("Queue Underflows");
			return 0;
		}

		else
			return queue[++front];
	}
}


class QueueOperations{
public static void main(String args[ ]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size of the Queue");
	int n=sc.nextInt();

	Queue q=new Queue(n);

	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the value "+(i+1));
		int val=sc.nextInt();
		q.enqueue(val);
	}

	System.out.println("Queue Contents are:");
	for(int i=0;i<n;i++)
	{
		System.out.println(q.dequeue());
	}
                
}
}