package exceptionhandling;

public class Example2 {
	public void validateage(int age) throws ArithmeticException{
		if(age<18) {
			//System.out.println("Not Eligible");
			throw new ArithmeticException("access denied");//output shows error with access denied
		}else {
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Custom Exception
		Example2 obj=new Example2();
		try {
			//obj.validateage(20);//else will print eligible
			obj.validateage(10);//No output Statement on catch will print
		}
		catch(ArithmeticException e) {
			
		}
		//obj.validateage(10);
	}

}
