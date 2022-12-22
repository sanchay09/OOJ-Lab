import java.util.Scanner; 

class Actor
{
	Scanner sc = new Scanner(System.in); 
	int actorID;
	String actorName; 
	int numberOfMovies;
	float earnings; 

	public void input()
	{
		System.out.print("\nEnter Actor ID: "); 
		actorID = sc.nextInt(); 

		System.out.print("Enter Actor Name: "); 
		actorName = sc.next();

		System.out.print("Enter the Number Of Movies: "); 
		numberOfMovies = sc.nextInt();

		System.out.print("Enter total earnings: "); 
		earnings = sc.nextFloat();
	}

	public void display(Actor act)
	{
		System.out.print("\nActor ID: "+act.actorID); 
		System.out.print("\nActor Name: "+act.actorName); 
		System.out.print("\nNumber Of Movies: "+act.numberOfMovies); 
		System.out.print("\nTotal Earnings: "+act.earnings);
	}
}

class ActorDetails{
	public static void main(String args[]){

	Actor[] act = new Actor[3]; 

	for(int i=0;i<3; i++)
	{
		act[i] = new Actor();
		act[i].input();
	}

	float min = act[0].earnings;
 
	for(int i=1;i<3;i++)
	{
		if(min>=act[i].earnings) 
		min = act[i].earnings;
	}

	for(int i=0;i<3;i++)
	{
		if(act[i].earnings==min)
		{
			act[i].display(act[i]); 
			break;
		}
	}
}
}
