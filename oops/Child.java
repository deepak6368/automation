package oops;

public class Child extends Parant {

	String name1 = "Smith";
	int age = 20;
	int data1 = 5;

	public static void main(String args[]) {
		Child c = new Child();
		System.out.println((c.name1));
		System.out.println((c.name));
		c.getName();
	}

}
