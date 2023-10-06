package keyword;
//प्राइवेट क्लास एक ऐसा क्लास है जिसे केवल उसी बाहरी क्लास के भीतर ही एक्सेस किया जा सकता है। 
//इसे विभिन्न पैकेजों में उपवर्गों या कक्षाओं सहित किसी अन्य वर्ग से एक्सेस या त्वरित नहीं किया जा सकता है। यहाँ एक उदाहरण है:
final class PrivateClass1 {
	final int  i = 10;
	static void privateMethod1()
	{
		System.out.println("This is from Private class");
	}
	public static void main(String[] args) {
		privateMethod1();
	}

}
