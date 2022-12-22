import java.util.Scanner; 

class Hospital
{
	int bill_id; 
	String patientName; 
	float billAmount; 
	float discount;
 
	Hospital(){}

	Hospital(int bill_id, String patientName)
	{
		this.bill_id = bill_id; 
		this.patientName = patientName;
	}

	public void calculate(float amt1,float amt2)
	{
		float a = amt2; 
		if(amt2>2500f)
		{
			discount = 0.1f*a; 
			amt2 = a - discount;

		}

		else if((amt2>1000)&&(amt2<=2500))
		{
			discount = 0.05f*a; 
			amt2 = a - discount;
		}

		else
		{
			discount = 0f; 
			amt2=a;
		}

	this.billAmount = amt1+amt2;
	}

	public void display()
	{
		System.out.println("\nBill ID: "+this.bill_id); 
		System.out.println("Patient Name: "+this.patientName); 
		System.out.println("Bill Amount: "+this.billAmount); 
		System.out.println("Discount: "+this.discount);
	}
}

class HospitalBill{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in); 

	int billID;
	String name; 
	float consultFee,labCharge;

	System.out.print("\nEnter bill ID: "); 
	billID = sc.nextInt();

	System.out.print("Enter Patient name: "); 
	name = sc.next();

	System.out.print("Enter Consultation Fee: "); 
	consultFee = sc.nextFloat();

	System.out.print("Enter Lab Charges: "); 
	labCharge = sc.nextFloat();

	Hospital h = new Hospital(billID,name); 
	h.calculate(consultFee,labCharge);
	h.display();
}
}
