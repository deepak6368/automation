package accessModifier;

public class ExceptionHandling {

	public static void main(String[] args) {
		int i = 10;
		int k = 0;
		
//		byte b = i+1; // errors
		
		
		int j = 0;
		try {
			k = i/j; //  this is calle Exception (infinite or undifined.)
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		  
		finally
		{
			System.out.println("finally block");
		}
		System.out.println(k);
		System.out.println("End of the Programe");
	}

}

