package oops;

public class Other1 {
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
	        OverLoading o = new OverLoading();
	        o.getvalue((byte) 5, (byte) 10);
	        o.getvalue((short) 100);
	        o.getvalue('A');
	    }
	

}
