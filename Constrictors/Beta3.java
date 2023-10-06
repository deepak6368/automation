package Constrictors;

public class Beta3 {
	int i = 10;

	void test(int i) {

		System.out.println(i);
		System.out.println(this.i); // ye current class ke variable ko print karega
		i = this.i;// ab mujhe Class varibale ki value mujhe method ke varibale i me dalne hain to
		System.out.println(i);

	}

	public static void main(String[] args) {
		Beta3 b2 = new Beta3();
//		b2.test(5); // yaha method wala i print hua hain ab mujhe Class ka i variable print karan to 
		b2.test(5);
	}

}
