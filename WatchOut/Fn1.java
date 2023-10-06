package WatchOut;

public class Fn1 {
//	Using void methods
	void addition()
	{
		int i = 1;
		int j = 2;
		int k = i+j;
		System.out.println(k);
	}
	void subtraction()
	{
		int l = 10;
		int m = 05;
		int n = l-m;
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		Fn1 obj2 = new Fn1();
		obj2.addition();
		Fn1 obj = new Fn1();
		obj.subtraction();
		
	}

}
