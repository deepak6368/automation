
public class Keyword4Block {
	void test ()
	{
		System.out.println("This is test");
	}
	static 
	{
		System.out.println("This is static block");
	}
	// static block always called first. 
	//static block is called only once.
	
	public static void main(String[] args) {
		Keyword4Block k1 = new Keyword4Block(); // this is print 1st- This is static block
		k1.test();  // This is test
		Keyword4Block k2 = new Keyword4Block();
		k2.test();  // This is static block , This is test, This is test
		

	}

}
