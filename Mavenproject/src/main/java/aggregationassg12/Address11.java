package aggregationassg12;

public class Address11 {
	String housename;
	String place;
	String state;
	int pincode;
	Student11 obj;
	public Address11(Student11 obj,String housename, String place,String state, int pincode) {
		this.housename=housename;
		this.place=place;
		this.state=state;
		this.pincode=pincode;
		this.obj=obj;
	}
	public void display() {
		System.out.println("Student Details:");
		System.out.println("1. Name: "+obj.name);
		System.out.println("2. Roll Number: "+obj.rollNumber);
		System.out.println("3. Address: ");
		System.out.println("\t HouseName: "+housename);
		System.out.println("\t Place: "+place);
		System.out.println("\t State: "+state);
		System.out.println("\t Pincode: "+pincode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student11 a=new Student11("Saritha", 1440782);
		Address11 b=new Address11(a,"Krishna Nivas","Sreekaryam","Thiruvananthapuram", 695002);
		b.display();

	}
}
