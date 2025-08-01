package superkeyword;

public class SuperVariable2 extends SuperVariable1 {
	String color="Blue";
	public void display() {
		//System.out.println(color);
		System.out.println(super.color);
		System.out.println(color);
	}
	
	
	public static void main (String[] args) {
		SuperVariable2 obj= new SuperVariable2();
		obj.display();
		
	}

}

