package polymorphism;

public class Account1 {
	private double balance;
	  //withdraw method
	public void withdraw(double initialBalance, double limit, double amount) {
		this.balance = initialBalance;
		//Check if the amount to be withdrawn is less than or equal to the available balance
	    if (amount <= balance) {
	      balance =balance - amount;
	      System.out.println("\nCurrent Balance after Withdrawal: Rs "+balance+"/-");
	    }
	    else {
	    	System.out.println("\nInsufficient Balance to withdraw given amount.");
	    }
	 }
}
