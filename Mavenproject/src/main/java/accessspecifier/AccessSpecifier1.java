package accessspecifier;

public class AccessSpecifier1 {
	public void display1() {
		System.out.println("Saritha");
	}
	private void display2() {
		System.out.println("Trivandrum");
	}
	protected void display3() {
		System.out.println("Kerala");
	}
	void display4() {
		System.out.println("India");
	}
	public static void main(String[] args) {
		AccessSpecifier1 obj=new AccessSpecifier1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}

}
