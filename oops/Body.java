package oops;

public class Body extends Person {
	String name1 = "Smith";
	int age = 20;
	int data1 = 5;
	public static void main(String[] args) {
		Body c = new Body();
		System.out.println((c.name1));
		System.out.println((c.name));
		c.getName();
	}

}
