package inheritanceassg10;

public class TotalSalary extends HraPf{
	int total;
	public void salary() {
		//total=basicpay+hra-pf-deduction+bonus
		total=bp+hra-pf-d+bo;
		System.out.println("6. Total Salary by hand: "+total+"\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalSalary a=new TotalSalary();
		a.display();
		a.calculate();
		a.salary();
	}
}
