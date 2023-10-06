package Bank;

import accessModifier.MyClass;

public class CallMyClassMethods extends MyClass {
	public static void main(String[] args) {
		CallMyClassMethods call = new CallMyClassMethods();
		call.protectedMethod();
		call.publicMethod();
//		call.defaultMethod(); // The method defaultMethod() from the type MyClass is not visible
//		call.privateMethod(); // The method privateMethod() from the type MyClass is not visible
	}

}
