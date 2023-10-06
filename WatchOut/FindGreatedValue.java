package WatchOut;

public class FindGreatedValue {

	public static void main(String[] args) {
		int a = 1000;
		int b = 2000;
		int c = 200;
		if (a > b) {
			if (a > c) {
				System.out.println(a + " is largest number");
			} else {
				System.out.println(c + " is largest number");
			}
		} else {
			if (b > c) {
				System.out.println(b + " is the largest number");
			} else {
				System.out.println(c + " is the greated number");
			}
		}

	}
}
