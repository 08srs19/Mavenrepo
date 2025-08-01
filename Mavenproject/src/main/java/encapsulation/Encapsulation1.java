package encapsulation;

public class Encapsulation1 {
	private String name;
	private int age;
	public void setdetails(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void getdetails() {
		System.out.println(name);
		System.out.println(age);
	}
}
