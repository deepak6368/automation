package WatchOut;

public class Fn3 
//  Non- void function/Method without parameter
{
	int getaddition(){
		int i = 1;
		int j = 2;
		int k = i+j;
		return k;
	}
	public static void main(String[] args) {
		Fn3 obj = new Fn3();
		int value = obj.getaddition();
		System.out.println(value);
		System.out.println(obj.getaddition());
	}

}
