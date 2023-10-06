package WatchOut;

public class CondtionalStatmentAssignment {

	public static void main(String[] args) {

//		int x = 13;
//		int y = 15;
//		int z = 12;
////		System.out.println(x+y+z);
//		if (x > y) // 10>20
//		{
////			True
//			if(x > z) // 10>20 flase
//			{
////				True
//				System.out.println("x is grater then y and z");
//			}
//			else
//			{
//				System.out.println("x is grater then y and less then z");
//			}
//		}
//		else // else check karga ki x is less then y or z
//		{
////			False
//			if (x>y) 
//			{ 
//				System.out.println("x is less then y but grater then z");
//			}
//			else 
//			{
//				System.out.println("x is less then y and  z");
//				
//			}
//		}

		int a = 1000;
		int b = 2000;
		int c = 200;
		if (a > b) {
			if (a > c) {
				System.out.println(a + " is largest number");
			} else {
				System.out.println(c + " is largest number");
			}
		} else {
			if (b > c) {
				System.out.println(b + " is the largest number");
			} else {
				System.out.println(c + " is the greated number");
			}
		}

	}

}
