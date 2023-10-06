package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		// Arrays - similer data type 
		// Collection - multipule data type
		// list,set , Map
		// list ..? linked list, array list, vector
		// set .. hashset
		// Map .. hashmap (Self read)
		
		// the oder of the value is same
//		 its accepts the dublicate value
//		LinkedList al = new LinkedList();
//		ArrayList al = new ArrayList();
		Vector al = new Vector();
		System.out.println(al);
		byte b = 10;
		al.add("Jhon");
		al.add(1);
		al.add(false);
		al.add(55.6F);
		System.out.println(al);
		al.add(3,"new");
		al.remove(3);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		
		
	}

}
