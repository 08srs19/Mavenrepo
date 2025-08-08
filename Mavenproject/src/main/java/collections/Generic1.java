package collections;

import java.util.*;

public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruit = new ArrayList<String>();
		
		//Method 1- add()
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Grapes");
		fruit.add("Orange");
		fruit.add("Kiwi");
		System.out.println(fruit);
		
		//Method 2-get()
		System.out.println(fruit.get(1));
		
		//Method 3-set()
		fruit.set(3, "Strawberry");
		System.out.println(fruit);
		
		fruit.add("Banana");
		System.out.println(fruit);
		
		//Method 4- indexOf()
		System.out.println(fruit.indexOf("Banana"));//first index of Banana
		
		//Method 5-lastIndexOf()
		System.out.println(fruit.lastIndexOf("Banana"));//last index of Banana
		
		//Method 6-remove()
		fruit.remove(5);
		System.out.println(fruit);
		
		//Method 7-contains()
		System.out.println(fruit.contains("Grapes"));
		
		//Method 8-isEmpty()
		System.out.println(fruit.isEmpty());
		
		//Method 9-size()
		System.out.println(fruit.size());
	}
}