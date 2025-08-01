package encapsulation;

public class BankAccount1 {
	private String name;
	private int accountnumber;
	private double balance;
	public void setaccountdetails(String name, int accountnumber, double balance) {
		this.name=name;
		this.accountnumber=accountnumber;
		this.balance=balance;
	}
	public void getaccountdetails() {
		System.out.println("Bank Account Details:\n");
		System.out.println("Name: "+name+"\n");
		System.out.println("Account Number: "+accountnumber+"\n");
		System.out.println("Current Balance: Rs "+balance+"/-");
	}

}
