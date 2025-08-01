package polymorphism;

public class Final extends Account1{
	private double maximum;
	//withdraw method
	public void withdraw(double initialBalance, double limit, double amount) {
	    this.maximum= limit;
	    System.out.println("Account Details:");
	    System.out.println("\nAvailable Balance: Rs "+initialBalance+"/-");
	    System.out.println("\nWithdrawal Limit: Rs "+limit+"/-");
        System.out.println("\nAmount to Withdraw: Rs "+amount+"/-");
		//Check if the amount to be withdrawn is less than or equal to the withdrawal limit
	    if (amount <= maximum) {
	        // Call the withdraw method of Account1
	        super.withdraw(initialBalance,limit,amount);
	      }
	    //Check if the amount is greater than available balance 
	    else if(amount > initialBalance) {
	    	  System.out.println("\nUnable to process due to insufficient balance.");
	      }
	    else {
	    	  System.out.println("\nWithdrawal Limit exceeded. Unable to process further."); 
	      }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final obj=new Final();
		obj.withdraw(1000,250,200);
		
	}
}
