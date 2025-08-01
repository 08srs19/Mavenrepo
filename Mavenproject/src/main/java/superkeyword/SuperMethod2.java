package superkeyword;

public class SuperMethod2 extends SuperMethod1 {
	public void childdisplay() {
		super.display();
		System.out.println("Child Class");
		//super.display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethod2 obj=new SuperMethod2();
		obj.childdisplay();

	}

}
