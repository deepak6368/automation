package WatchOut;

public class Fn4 {
//  Non- void with parameter function/Method
	String FullName(String FirstName, String LastName) 
	{
		String FullName = FirstName +" "+ LastName;
		return FullName;
		
	}
	public static void main(String[] args) {
		Fn4 obj = new Fn4();
		String FullName = obj.FullName("Deepak", "Goswami");
		System.out.println(FullName);
	}

}
