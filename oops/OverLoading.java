package oops;

public class OverLoading {
	void getvalue(byte a, byte b)
	{
		System.out.println("byte 1 is" +" "+a +","+ " "+  "Byte 2"+" " + b);
	}
	void getvalue(int a)
	{
		System.out.println("Int Parameter is ---" + a);
	}
	void getvalue(int a,float b)
	{
		System.out.println("One int " + a+ "Float Parameter is --- " + b);
	}
	void getvalue(float a,int b)
	{
		System.out.println("One float " + a+ "int Parameter is --- " + b);
	}
	public static void main(String[] args) {
		OverLoading o = new OverLoading();
		o.getvalue(5);
		o.getvalue(2.5f,12);
		o.getvalue(10,155.5f);
		o.getvalue((byte) 5, (byte) 10);
	}

}
