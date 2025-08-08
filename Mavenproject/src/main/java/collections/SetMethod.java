package collections;

import java.util.*;

public class SetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fruit = new TreeSet<String>();
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Grapes");
		fruit.add("Orange");
		fruit.add("Kiwi");
		System.out.println(fruit);
		Set<String> color = new HashSet<String>();// No Duplicate 
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		color.add("Red");
		color.add("Black");
		System.out.println(color);
		
		//Method 1- addAll()
		color.addAll(fruit);
		System.out.println(fruit);
		System.out.println(color);
		
		//Method 2- removeAll()
		color.removeAll(fruit);
		System.out.println(fruit);
		System.out.println(color);
		
		//Method 3- containsAll()
		System.out.println(color.containsAll(fruit));
		
		//Method 4- size()
		System.out.println(color.size());

	}

}
