package Constrictors;

public class Beta {
	Beta()
	{
//		this(5); // dekhte hia kya print hoga.out put is 1- This is the parameteraize constructor 2- This is Constructor.
		

		System.out.println("This is Constructor.");
	}
	Beta (int i)
	{
		this();
//		this(); // output is 1- This is Constructor.
		System.out.println("This is the parameteraize constructor");
	}
	public static void main(String[] args) {
//		new Beta();  // output is - This is Constructor.
//		new Beta(); // 
		new Beta(5); // output is 1- This is Constructor, 2- This is the parameteraize constructor
		

		
	}

}
