
public class Keyword1 {
//	 we have two types of the keyword 
//		1st is staic (it is used for any class so that we do not need to create object for the class.)
//		2nd is final.
		static int i = 1;
	static void method1()
	{
	System.out.println("This is method1");
	}
	public static void main(String[] args) {
		method1(); // Static keyward ke saath hume class ka object banane ki Zarurat nahi hai.
		System.out.println(i);
	}

}
// ab ager hume ise new class me print karana hain to hum kaise karneg? 
//		 swich to the new class Keyword2