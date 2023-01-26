import java.util.*;

class WrongAge extends Exception
{
    public String getMessage()
    {
        return "Age Cannot Be Negative";
    }
}

class InvalidAge extends Exception
{
    public String getMessage()
    {
        return "Son's Age cannot be greater than Father's!";
    }
}

class Father
{
    Scanner s = new Scanner(System.in);
    int fatherAge;
    Father() throws WrongAge
    {
        System.out.print("Enter the Father's Age: ");
        fatherAge = s.nextInt();

        try
        {        
		if(fatherAge<0)
            throw new WrongAge();
        }

        catch(WrongAge e1)
        {
            System.out.println(e1.getMessage());
            System.exit(0);
        }
    }
}

class Son extends Father
{
    int sonAge;
    Son() throws WrongAge,InvalidAge
    {
        super();
        System.out.print("Enter the Son's Age: ");
        sonAge = s.nextInt();
        try
        {
        	if(sonAge<0)
            throw new WrongAge();
        }

        catch(WrongAge e2)
        {
            System.out.println(e2.getMessage());
        }

        try
        {
        	if(sonAge>fatherAge)
            throw new InvalidAge();
        }

        catch(InvalidAge e3)
        {
            System.out.println(e3.getMessage());
        }
    }
}

class Agecheck
{
    public static void main(String[] args) throws WrongAge,InvalidAge
    {
        new Son();
    }
}
