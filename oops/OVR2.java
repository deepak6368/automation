package oops;

public class OVR2 extends OVR1 {
	@Override
	void view (String Text)
	{
		System.out.println("This method from OVR2 "+ Text);
	}
	public static void main(String[] args) {
		OVR2 O2 = new OVR2();
		O2.view("Laptop");

	}

}
