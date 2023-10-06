package Constrictors;

	public class Beta2 {
		Beta2(int i, int j) {
	//		this(15, 10,15);//Recursive constructor invocation Beta2(int, int)
			System.out.println(i + j);
		}
	
		Beta2(int i, int j, int k) {
			this(15, 10); // output is 1st- 25, 2nd - 35 // Recursive constructor invocation Beta2(int, int)
	
			System.out.println(i + j + k);
	//		this(15, 10,); //Constructor call must be the first statement in a constructor loop ban jayega (Not Posible)
		}
	
		public static void main(String[] args) {
			new Beta2(11, 12, 12);
	
		}
	
	}
