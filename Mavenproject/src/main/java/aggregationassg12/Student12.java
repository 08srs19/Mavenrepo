package aggregationassg12;

import java.util.Scanner;

public class Student12 {
	String name;
	int rollnumber;
	Address12 obj;
	public Student12(String name, int rollnumber, Address12 obj) {
		this.name=name;
		this.rollnumber=rollnumber;
		this.obj=obj;
	}
	public void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name =sc.nextLine();
		System.out.println("Enter rollno");
		rollnumber =sc.nextInt();
	}
	public void display() {
		System.out.println(name);
		System.out.println(rollnumber);
		System.out.println(obj.housename);
		System.out.println(obj.street);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address12 b=new Address12("","");
		Student12 a=new Student12("",0,b);
		a.inputData();
		b.get();
		a.display();
	}

}
