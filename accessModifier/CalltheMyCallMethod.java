package accessModifier;

public class CalltheMyCallMethod {

	public static void main(String[] args) {
		MyClass call = new MyClass();
		call.protectedMethod();
		call.publicMethod();
		call.defaultMethod();
//		call.privateMethod(); // The method privateMethod() from the type MyClass is not visible
		
	}

}
