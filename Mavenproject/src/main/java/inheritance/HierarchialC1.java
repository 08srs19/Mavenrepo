package inheritance;

public class HierarchialC1 extends HierarchialP {
	
	public void type() {
		System.out.println("Type is Maruti");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialC1 a=new HierarchialC1();
		a.car();
		a.type();
	}

}
