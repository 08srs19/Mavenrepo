package aggregationassg12;

import java.util.Scanner;

public class Address12 {
	String housename;
    String street;
    public Address12(String housename, String street) {
       this.housename=housename;
       this.street=street;
    }
    public void get() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter housename");
		housename =sc.nextLine();
		System.out.println("Enter street");
		street =sc.nextLine();
    }
    

}
