package inheritance;

public class SinglelevelC extends SinglelevelP {
	
	public void run() {
		System.out.println("Child Running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglelevelC obj=new SinglelevelC();
		obj.Sing();
		obj.run();
	}

}
