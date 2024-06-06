package javaLastAssessment;

import java.util.Scanner;

public class check_Number {

	public static void main(String[] args) {
	
		int number;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		if(number < 0) {
			System.out.println("The number is negative");
		}
		else if(number == 0) {
			System.out.println("The number is zero");
		}
		else {
			System.out.println("The number is positive");
		}
	}

}
