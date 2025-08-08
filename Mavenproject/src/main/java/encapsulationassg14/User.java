package encapsulationassg14;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        Bank obj=new Bank();
        obj.setPin(pin);
        obj.validatePin(amount);
	}
}
