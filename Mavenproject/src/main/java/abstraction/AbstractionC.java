package abstraction;

public class AbstractionC extends AbstractionP {
	
	public void display() {
		System.out.println("Abstract method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractionC obj=new AbstractionC();//First option
		AbstractionP obj=new AbstractionC();//Second option
		obj.display();
		obj.print();

	}

}
