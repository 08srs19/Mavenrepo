package encapsulationassg14;

public class Bank {
	private int pin;
    // To Set PIN from User class
    public void setPin(int pin) {
        this.pin = pin;
    }
    // To Validate PIN (1001, 1234, 1212) and withdraw amount
    public void validatePin(double amount) {
         if(pin == 1001 || pin == 1234 || pin == 1212) {
        	 System.out.println("PIN validated successfully");
             System.out.println("Rs " + amount + " have been withdrawn successfully");
         } else {
             System.out.println("Invalid PIN. Transaction failed.");
         }
        /*if(pin==1001) {
        	System.out.println("PIN validated successfully");
            System.out.println("Rs " + amount + " have been withdrawn successfully");
        }else if(pin ==1234) {
        	System.out.println("PIN validated successfully");
            System.out.println("Rs " + amount + " have been withdrawn successfully");
        }else if(pin ==1212) {
        	System.out.println("PIN validated successfully");
            System.out.println("Rs " + amount + " have been withdrawn successfully");
        }else {
        	 System.out.println("Invalid PIN. Transaction failed.");
        }*/
    }
}
