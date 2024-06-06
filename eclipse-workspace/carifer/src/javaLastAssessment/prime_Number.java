package javaLastAssessment;

import java.util.Scanner;

public class prime_Number {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int i = 2;
		boolean prime = true;
		while(num > i) {
			if( num % i == 0) {
				System.out.println("Its  a not prime number");
				prime = false;
				break;
			}
			i = i+1;
		}
		if(prime == true) {
			System.out.println("Its a prime number");
		}
	}

	
}
