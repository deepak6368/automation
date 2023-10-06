package WatchOut;

public class ConditionStatements {
//
//	public static void main(String[] args) {
////	  Conditional Statement if - else   ( ya to condition true hogi ya to false hogi).
////		Normal if else
//
//
//		int a = 4;
//		int b = 5; 
//		if (a < b) {
//
////		true
//			System.out.println("A is grater then B");
//		} else {
////			flase
//			System.out.println("B is grater then A");
//		}
//	}
//}
// ----------------------------------------------------------------------------------------------------------------------
//public class ConditionStatements {
//
//	public static void main(String[] args) {
////			Nested if -else
//		int x = 15;
//		int y = 10;
//		int z = 20;
//		if (x < y) // 15<00 False
//		{
////				 ture
//			if (x < z) {
////					 true
//				System.out.println("x is less then y and z");
//			} else {
////					 false
//				System.out.println("x is less then y but more then z");
//			}
//
//		}
//
//		else // (x > y) else kya check karega ki x is grater then y
//		{
////				 flase
//			if (x < z) // 15 > 20 true ho jayega to ye print ho jayega 
//			{
////	true
//				System.out.println("x is grater then Y but less then z"); // this is true and print this value.
//			} else {
////	false
//						System.out.println("x is grater then Y and z");
//						}
//			
//		
//	

//-----------------------------------------------------------------------------------------------

	public static void main(String[] args) {
////		else - if ladder.
//
//		int mark = 33;
//		if (mark > 70 && mark < 100) {
//			System.out.println("A grade");
//		} else if (mark > 40 && mark < 70) {
//			System.out.println("B grade");
//		} else if (mark > 34 && mark < 45) {
//			System.out.println("C grade");
//		} else if (mark < 34) {
//			System.out.println("Fail");
////		}

			{
				int sum = 20;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				System.out.println("Sum: " + sum);
			}
		}
	}
//}