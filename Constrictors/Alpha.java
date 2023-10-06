package Constrictors;

public class Alpha {
	Alpha() {
		System.out.println("This is the Constructor.");
	}
// Overloading in constructor.
	Alpha(int i){
		System.out.println("This is the parameterraize Constructor");
	}
	public static void main(String[] args) {
		Alpha a = new Alpha(); // run here the programe output is -- This is the Constructor.
		new Alpha(); // output is -- This is the Constructor.
		Alpha A = new Alpha(5);
		new Alpha(5);// as an object is created constructor is calling
	}

}
