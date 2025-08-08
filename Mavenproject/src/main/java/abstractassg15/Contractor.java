package abstractassg15;

public class Contractor extends Employee {
	    int workingHours;
	
	    public Contractor(String name, double paymentPerHour, int workingHours) {
	        super(name, paymentPerHour);
	        this.workingHours=workingHours;
	    }
	   
	    public double calculateSalary() {
	        double a= paymentPerHour * workingHours;
	        return a;
	    }
}