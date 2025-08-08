package collections;
import java.util.*;
public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> color = new ArrayList<String>();
		Set<String> color = new TreeSet<String>();// No Duplicate 
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		color.add("Red");
		System.out.println(color);
	}
}