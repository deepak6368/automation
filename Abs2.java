public class Abs2 extends Abs1 {

	@Override
	void getData() {
System.out.println("This is from Abs2");		
	} // Yaha hum simply Abs1 class ko extends karenge. but yaha per hume error aa rahi hain 
//	show the details, ( ab ye hume bol raha hain ya to "The type Abs2 must implement the inherited abstract method Abs1.getData()"
//	 iske do fixes hume diye hue hai 1- Add unimplimented Methods,2-Make type "Abs2" abstract.
//	kyo ki ek abstract class normal class ko extends nahi kar sakti h until and unless jo parent class hai uske abstract method ko impliment na kar liya ho.
//	So just click on the Add unimplimented Methods nispe click karenge to ek method Override ho kar apne aap aa jayega. or ye same method hai jo hum ne Abs1 class me banaya tha.
//	ab now here the overriding is working.
//	ab yaha System.out.println("This is from Abs2") now AB RUN KARKE DEKHTE HAI.
	
	public static void main (String  []args){
		Abs2 a2 = new Abs2();
		a2.getData();
		
	}

}
//output - This is from Abs2