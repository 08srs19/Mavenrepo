package collections;

import java.util.*;

public class CollectionAssg16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Create a new ArrayList, add some colors and print all
		List<String> colors = new ArrayList<String>();
		colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
		System.out.println("1. List of Colors: "+colors);
		
		//2.Retrieve an element at a specified index from the given ArrayList
		int in=3;
		System.out.println("\n2. Element at index "+in+": "+ colors.get(in));
		
		//3. Iterate through all elements in the given ArrayList
        System.out.println("\n3. Iterating through ArrayList:");
        for (String color : colors) {
            System.out.println("\t"+color);
        }
        
        //4. Remove the third element (index 2) from the given ArrayList
        colors.remove(2);
        System.out.println("\n4. After removing third element: " + colors);
        
        // 5. Search for an element in the given ArrayList
        String search = "Orange";
        //String search ="Blue";
        System.out.println("\n5. Search for an element: "+search);
        if (colors.contains(search)) {
            System.out.println("\t"+search + " is found in the given list.");
        } else {
            System.out.println("\t"+search + " is not found in the given list.");
        }
        
        //HashSet
        colors.add("Red");
        colors.add("Blue");
        System.out.println("\nUsing HashSet Collection Method:");
        System.out.println("\tList of Colors after adding new elements: "+colors);
        Set<String> color = new HashSet<String>(colors);
        System.out.println("\tFinal List of Colors without duplication: " + color);
        
    }
}
