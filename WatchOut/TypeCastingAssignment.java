package WatchOut;

public class TypeCastingAssignment {

	public static void main(String[] args) {
		
//		TypeCasting Assignment - 1 ........(byte to all datatype)
//		byte to Byte typecasting.
//		byte b1 = 10;
//		byte b2 = 11;
//		byte b3 = (byte) (b1+b2);
		
//		byte to short typecasting.
//		byte b = 10;
//		short s = 112;
//		byte sum = (byte) (b + s); 
		
//		byte to int typecasting.
//		byte b1 = 10;
//		int i = 12;
//		byte sum = (byte) (b1+i);
		
//		byte to long typecasting.
//		byte b = 10;
//		long l = 12;
//		byte sum = (byte) (b+l);
		
		
//		byte to float typecasting.
//		byte b = 10;
//		float f = 10.2f;
//		byte sum = (byte) (b+f);
		
//		byte to double typecasting.
//		byte b = 10;
//		double d = 1000;
//		byte sum = (byte) (b+d);
		
//		byte to char typecasting.
//		byte b = 10;
//		char c = 'd';
//		byte sum = (byte) (b+c);
		
		
//		byte to boolean typecasting.
//		byte b = 10;
//		boolean B = true;
//		byte sum = b+B;			// we can not used type casting with boolean data type.
		
//-------------------------------------------------------------------------------------------------------------------------------------------------
//		Now we used short to all datatype.
//		short s = 10;
//		byte b = 1;
//		short sum = (short) (s+b); // here byte value is less then short. so why we need this typecast here?
		
//		Short to short
//		short s1 = 10;
//		short s2 = 11;
//		short s3 = (short) (s1+s2);

//		Short to int
//		int a = 10;
//		short s = 12;
//		short sum = (short) (a + s);
		
		
//		Short to long.
//		short s = 12;
//		long l = 16;
//		short s1 = (short) (s+l);
		
//		Short to float.
//		short s = 12;
//		float f = 10.10f; 
//		short s1 = (short) (s+f);
		
//		Short to double.	
//		short s = 10;
//		double d = 12.12;
//		short s1 = (short) (s+d);n
		
//		short to char.
//		int i = 102;
//		char name = 'D';
//		short sum = (short) (i + name);
		
//-------------------------------------------------------------------------------------------------------------------------------------------------
//		Now we used int to all datatype.	
//		int i = 111;
//		byte b = 10;
//		int I = i + b; // Here desnot need to type cast becouse int size is 32 bit & bite is 8bits int > bite.
		
//		Int to short 
//		int i = 10;
//		short s = 100;
//		int sum = i + s; // Here desnot need to type cast becouse int size is 32 bit & short size is 16 bits int > short.
		
//		int to int.
//		int i1 = 10;
//		int i2 = 10;
//		int sum = i1 + i2; // Here desnot need to type cast becouse both are int is same size.
		
//		int to long.
//		int i = 10;
//		long l = 11;
//		int l1 = (int) (i + l);
		
//		int to float
//		int i = 100;
//		float f = 100.11f;
//		int I = (int) (i + f); // here both of daytatype are same size but int can not store desimal number.
		
//		int to double.
//		int i = 1000;
//		double d = 11.231;
//		int i1 = (int) (i + d);
		
//		int to char.
//		int i = 100;
//		char c = 'D';
//		int sum = i + c; //Here desnot need to type cast becouse int size is 32 bit & char size is 16 bits int > char
		
//-------------------------------------------------------------------------------------------------------------------------------------------------
//		Now we used long to all datatype.
//		byte b = 100;
//		long l = 10000;
//		long sum = b + l; // Here desnot need to type cast becouse long size is 64 bit & bite is 8bits long > bite.
		
//		long to short 
//		short s = 12;
//		long l = 11;
//		long total = s+l; // Here desnot need to type cast becouse long size is 64 bit & short is 16 bits long > short.
		
//		long to int 
//		int i = 10;
//		long l = 12;
//		long s = i+l; // Here desnot need to type cast becouse long size is 64 bit & int size is 32 bits long > int.
		
		
//		long to float 
//		float f = 100;
//		long l = 114;
//		long l1 = (long) (f+l);  
		
//		long to double
//		long l = 12;
//		double d =12;
//		long j = (long) (l+d); // here both of daytatype are same size but long not store desimal number
		
//		long to char.
//		char c = '1';
//		long l = 14;
//		long l1 = c+l; // Here desnot need to type cast becouse long size is 64 bit & char size is 16 bits.
		
//-------------------------------------------------------------------------------------------------------------------------------------------------				
//		Now we used float to all data type..
//		 float to byte 
//		float f = 10.11f;
//		byte b = 1;
//		float f1 = f+b;  //  Here desnot need to type cast becouse floate is 32bits either byte size is 8bits float > bits.
		
//		float to short 
//		short s = 10;
//		float f = 11.1f;
//		float f1 = s+f;  //  Here desnot need to type cast becouse floate is 32bits either short size is 16 bits float is > short.
		
//		float to int...
//		int i = 10;
//		float f = 11f;
//		float f1 = i+f; //  Here desnot need to type cast becouse floate is 32bits either int size is 32 bits float > int.
		
		
//		float to long..
//		long l = 10;  //64bits
//		float f = 10.11f;  // 32 bits
//		float f1 = l+f; // 
		
//		float to float 
//		float f1 = 10;
//		float f2 = 100.50f;
//		float f3 = f1+f2;
		
//		float to double 
//		float f1 = 10.f;
//		double d = 140;
//		float f = (float) (f1 + d);// float size is 32 bits and double size is 64 bit that why we used type casting.
		
		
//		float to char .
//		char c = 'a';
//		float f = 12002.10f;
//		float f1 = c+f; // Here desnot need to type cast becouse float size is 32bits & char size is 16 bits.
		
//-------------------------------------------------------------------------------------------------------------------------------------------------		
		
//		Now we used double to all datatype.
//		Double to bits.
//		byte b = 12;
//		double d = 11;
//		double d1 = b+d;//Here desnot need to type cast becouse double size is 64 bits & byte size is 8 bits.
		
//		double to short.
//		short s = 10;
//		double d1 = 1230;
//		double d = s+d1;    //Here desnot need to type cast becouse double size is 64 bits & short size 16 bits.
		
//		double to int.
//		int i = 12;
//		double d1 = 123123;
//		double d = i+d1;     //Here desnot need to type cast becouse double size is 64 bits & int size 32 bits.
		
		
//		double to long.
//		long l = 100;
//		double d = 100;
//		double t = l+d;    //Here desnot need to type cast becouse double size is 64 bits & long size are same.
		
//		double to float.
//		float f = 12.20f;
//		double l = 12;
//		double d = f+l;    //Here desnot need to type cast becouse double size is 64 bits & float size is 32 bits.
		
//		Double to double.
//		double s = 12;
//		double s1 = 12;
//		double d = s+s1; //Here desnot need to type cast becouse both datatype are same.
		
//		double to char.
//		char o = '1';
//		double d1 = 123;
//		double d = o+d1;   //Here desnot need to type cast becouse double size is 64 bits & char size is 16 bits.
		
//-------------------------------------------------------------------------------------------------------------------------------------------------		
		
//		Now we used char to all data type.
		
//		byte b = 12;
//		char c = 's';
//		char c1 = (char) (b+c);
		
//		char to short.
//		short s = 1;
//		char c1 = '1';
//		char c = (char) (s+c1);
		
//		char to int 
//		int i = 12;
//		char c1 = 's';
//		char f = (char) (i+c1);

		
//		char to long.
//		long l = 12;
//		char g = 'd';
//		char total = (char) (l+g);
		
//		char to float.
//		float f = 12.12f;
//		char c = 'd';
//		char c1 = (char) (f+c);
		
//		char to double 
//		double d = 12;
//		char c = 's';
//		char total = (char) (d+c);
		
//		char to char 
//		char c1 = 's';
//		char c2 = 'w';
//		char total = (char) (c1+c2);
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
