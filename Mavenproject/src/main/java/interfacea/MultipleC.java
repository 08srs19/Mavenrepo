package interfacea;

public class MultipleC implements MultipleP1,MultipleP2 {
	public void display() {
		System.out.println("Method in P1");
	}
	public void print() {
		System.out.println("Method in P2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleC obj=new MultipleC();
		obj.display();
		obj.print();

	}

}
