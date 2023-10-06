package keyword;

public class Keyword2Call extends Keyword1variable{
	Keyword2Call()
	{
		int i = 12;
		int j = 2;
		int k = i-j;
		System.out.println(k);
	}
	static
	{
		System.out.println("This is static from call class");
	}
	public static void main(String[] args) {
		Keyword2Call call = new Keyword2Call();

		
		
	}

}
