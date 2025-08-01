package inheritanceassg10;

public class HraPf extends Print {
	int hra;
	int pf;
	public void calculate() {
		hra=(5*bp)/100;
		pf=(20*bp)/100;
		System.out.println("4. HRA: "+hra+"\n");
		System.out.println("5. PF: "+pf+"\n");
	}
}
