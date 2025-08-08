package inheritanceassg10;
import java.util.Scanner;
public class Print {
	//int bp=50000;//basicpay
	//int d=8000;//deduction
	//int bo=5000;//bonus
	int bp,d,bo;
	public void display() {
		System.out.println("Salary Slip Details of an Employee: \n");
		Scanner sc=new Scanner(System.in);
		System.out.print("1. Basic Pay:");
		bp=sc.nextInt();
		System.out.print("2. Deduction:");
		d=sc.nextInt();
		System.out.print("3. Bonus:");
		bo=sc.nextInt();
	}
}