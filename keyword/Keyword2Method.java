package keyword;

public class Keyword2Method extends Keyword1variable {
	Keyword2Method() {
		int i = 5;
		int j = 10;
		int k = i + j;
		System.out.println(k);
	}

	static {
		int j = 20;
		System.out.println(j);
	}

	void test2() {
		System.out.println("This is test");
	}

	static {
		System.out.println("This is static block from method2");
	}
	static String name = "Deepak";

	public static void main(String[] args) {

	}

}
