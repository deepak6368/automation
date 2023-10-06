package Delegation;

public class Printing {
	
	public static void main(String[] args) {
		Printer P1 = new Printer();
		int value = P1.PrintByLeaser(10,20);
		System.out.println(value);
		Printer P2 = new Printer();
		int value2 = P2.PrintByInkJetPrinter(20,150);
		System.out.println(value2);
	}

}
