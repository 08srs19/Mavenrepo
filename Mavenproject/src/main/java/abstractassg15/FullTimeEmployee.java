package abstractassg15;

public class FullTimeEmployee extends Employee {
	final int W=8;
	public FullTimeEmployee(String name, double paymentPerHour) {
        super(name, paymentPerHour);
    }
	
    public double calculateSalary() {
        double b=paymentPerHour * W;
        return b;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor c = new Contractor("Amarnath", 500, 4);  
        FullTimeEmployee f = new FullTimeEmployee("Devika", 900);
        
        System.out.println("Contract Employee: ");
        System.out.println("\t Name: "+c.name);
        System.out.println("\t Payment Per Hour: "+c.paymentPerHour);
        System.out.println("\t Working Hours: "+c.workingHours);
        System.out.println("\t Salary: Rs "+c.calculateSalary());
        
        System.out.println("\nFull Time Employee: ");
        System.out.println("\t Name: "+f.name);
        System.out.println("\t Payment Per Hour: "+f.paymentPerHour);
        System.out.println("\t Working Hours: "+f.W);
        System.out.println("\t Salary: Rs "+f.calculateSalary());
	}
}