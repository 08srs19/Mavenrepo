package inheritance;

public class HierarchialC2 extends HierarchialP {
	
	public void speed() {
		System.out.println("Car Speed is 80 km/hr");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialC2 b=new HierarchialC2();
		b.car();
		b.speed();
	}
}
