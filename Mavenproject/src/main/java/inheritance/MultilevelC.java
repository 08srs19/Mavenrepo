package inheritance;

public class MultilevelC extends MultilevelP1{
	
	public void run() {
		System.out.println("Child Running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelC obj=new MultilevelC();	
		obj.draw();
		obj.Sing();
		obj.run();
	}

}
