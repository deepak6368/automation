
public class ThisKeyword {
	int i = 10;
	public void test1(int i)
	{
		System.out.println(i);
		System.out.println(this.i);
	}
	public int test2 (int i)
	{
		i = this.i;
		return i;
	}
	public static void main(String[] args) {
		ThisKeyword t = new ThisKeyword();
//		t.test1(5);
		System.out.println(t.test2(3));
	}

}
