package collections;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fruit = new TreeSet<String>();
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Grapes");
		fruit.add("Orange");
		System.out.println(fruit);
		
		Iterator<String> i=fruit.iterator();//creating an interface 
		
		while(i.hasNext()) {
			System.out.println(i.next());//checks elements are present using hasNext() and prints that using next()
		}
		
		i.remove();//removes last element
		System.out.println(fruit);
	}
	
}
