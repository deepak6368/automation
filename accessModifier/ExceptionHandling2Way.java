package accessModifier;

public class ExceptionHandling2Way {

	public static void main(String[] args) throws Exception {
		int i = 10;
		System.out.println(i);
	Thread.sleep(5000); // Unhandled exception type InterruptedException 
//	ye code wise error nahi hain but execptio hain isko handle karne k  liye 
	System.out.println(i);
	Thread.sleep(5000);
	System.out.println("EOP");
	}

}
