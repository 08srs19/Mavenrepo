package aggregation;

public class Student {
	String name;
	int rollnumber;
	Address obj;//joins both Address and Student classes
	public Student(String name, int rollnumber, Address obj) {
		this.name=name;
		this.rollnumber=rollnumber;
		this.obj=obj;
	}
	public void display() {
		System.out.println(name);
		System.out.println(rollnumber);
		System.out.println(obj.state);//to print state from address class
		System.out.println(obj.pincode);//to print pincode from address class
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address("TVM", 695002);
		Student b=new Student("Saritha", 1440781,a);
		b.display();
	}

}
