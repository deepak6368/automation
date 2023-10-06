
public class Keyword3 {
	// static variable hold thier values
	static int i = 10;
	Keyword3()
	{
		i++;
		System.out.println(i);
	}
	public static void main(String[] args) {
		Keyword3 K2 = new Keyword3(); //without static 11  > with Static 11
		
		Keyword3 K2a = new Keyword3();//without static 11  > with Static 12
		Keyword3 K2b = new Keyword3(); //without static 11  > with Static 13
	}

}
