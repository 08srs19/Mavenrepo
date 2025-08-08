package polymorphismassg13;

public class Onseason {
	double discountprice;
	double finalprice;
	public double discount(double price) {
        discountprice = price * 0.40;
        finalprice = price - discountprice;
        System.out.println("Applying OnSeason Discount (40%): " + discountprice);
        System.out.println("Final Price: Rs " + finalprice);
        return finalprice;
    }
}