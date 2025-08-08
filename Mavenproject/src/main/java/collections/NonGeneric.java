package collections;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class NonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List name = new ArrayList();
		Set name = new HashSet();//will not support TreeSet on non-generic
		name.add("Saritha");
		name.add('S');
		name.add(28);
		System.out.println(name);		
	}
}