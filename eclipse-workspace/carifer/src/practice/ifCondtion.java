package practice;

import java.util.Scanner;

public class ifCondtion {

	public static void main(String[] args) {
		
		int 	age;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if( age > 18) {
			System.out.println("Eligible for license");
		}else {
			System.out.println("not Eligible for license");
		}
	}

}
