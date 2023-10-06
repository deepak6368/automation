package oops;

public class Other {
//	void getvalue(short a)
//	{
//		System.out.println("short  is" +" "+a );
//	}
//	void getvalue(byte a, byte b)
//	{
//		System.out.println("byte 1 is" +" "+a +","+ " "+  "Byte 2"+" " + b);
//	}
//	void getvalue(int a, short b)
//	{
//		System.out.println("int is" +" "+a +","+ " "+  "short is "+" " + b);
//	}
//
//		    public static void main(String[] args) {
//	        Other O = new Other();
//	        O.getvalue((byte) 10, (byte)23);
//	        O.getvalue((short)100);
//	        O.getvalue((byte)10, (short)1);
//	    }
//	
//	}
	void getvalue(char a, byte b) {
		System.out.println("char 1st is " + a + " Byte 2nd is " + b);
	}
	void getvalue(byte a, byte b) {
		System.out.println("byte 1 is " + a + " Byte 2 is " + b);
	}

	void getvalue(short a) {
		System.out.println("Short Parameter is --- " + a);
	}

	void getvalue(char c) {
		System.out.println("Char Parameter is --- " + c);
	}

// Other methods...

	public static void main(String[] args) {
		Other o = new Other();
		o.getvalue((byte) 5, (byte) 10);
		o.getvalue((short) 100);
		o.getvalue('A');
		o.getvalue('B', (byte)0);
	}
}
