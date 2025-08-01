package polymorphism;

public class PolymorphismChild extends PolymorphismParent {
	public void display(int a,int b) {
		super.display(5, 6);
		int sub=a-b;
		System.out.println(sub);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismChild obj=new PolymorphismChild();
		obj.display(8, 4);
	}
}
