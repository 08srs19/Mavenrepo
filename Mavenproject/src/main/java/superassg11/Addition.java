package superassg11;

import java.util.Scanner;

public class Addition {
	int sum,a,b;
	public int add(int a, int b, int sum) {
		
		System.out.println("Enter the numbers: \n");
		Scanner sc=new Scanner(System.in);
		System.out.print("First Number: a= ");
		a=sc.nextInt();
		System.out.print("Second Number: b= ");
		b=sc.nextInt();
		sum=a+b;
		System.out.print("Sum of "+a+" and "+b+" is: "+sum);
		return sum;
	}

}
