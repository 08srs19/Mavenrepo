package polymorphismassg13;

import java.util.Scanner;

public class Offseason extends Onseason {
	static double price;
	double discountprice;
	double finalproce;
	public double discount(double price) {
		System.out.print("Customer Purchase Details");
		Scanner sc = new Scanner(System.in);
	    System.out.print("\nEnter purchase amount: Rs ");
	    price = sc.nextDouble();
	    System.out.print("Enter Season Type: ");
        String season = sc.next().toLowerCase(); 
        if (season.equals("offseason")) {
        	discountprice = price * 0.15;
            finalprice = price - discountprice;
            System.out.println("Applying OffSeason Discount (15%): " + discountprice);
            System.out.println("Final Price: Rs " + finalprice);  
        } else{
            super.discount(price);
        }
        return finalprice; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Offseason obj=new Offseason();
		obj.discount(price);
	}
}
