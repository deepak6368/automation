package keyword;

public class Keyword1variable {

	static int i = 10;

	Keyword1variable() {
		System.out.println("Hello, World!");
	}

	static void test() {
		System.out.println("this is static"); // 2nd call
	}

	static {
		System.out.println("This is static block from class1"); // first call
	}

	public static void main(String[] args) {

		test();
		System.out.println(i);

	}

	
	}


