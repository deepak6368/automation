package accessModifier;

public class MyClass {
	 public void publicMethod() {
	        System.out.println("This is a public method.");
	    }

	    private void privateMethod() {
	        System.out.println("This is a private method.");
	    }

	    protected void protectedMethod() {
	        System.out.println("This is a protected method.");
	    }

	    void defaultMethod() {
	        System.out.println("This is a default (no modifier) method.");
	    }
	public static void main(String[] args) {
		MyClass call = new MyClass();
		call.protectedMethod();
		call.publicMethod();
		call.defaultMethod();
		call.privateMethod();
		
	}

}
