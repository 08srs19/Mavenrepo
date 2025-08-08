package interfaceassg15;

import java.util.Scanner;

public class HDFC implements RBI {
	public double recurringDeposit(double amount, int duration) {
        // finalAmount = P * N + (P * N * (N+1) * R) / (2 * 12 * 100)
        // P = monthly deposit, N = duration of months, R = interest rate
        double finalAmount = (amount * duration) + 
            ((amount * duration * (duration + 1) * interestRate) / (2 * 12 * 100));
        System.out.println("Amount after " + duration + " months: Rs" +finalAmount);
        return finalAmount;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly deposit amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter duration of months: ");
        int duration = sc.nextInt();

        HDFC obj = new HDFC();
        obj.recurringDeposit(amount, duration);
	}
}