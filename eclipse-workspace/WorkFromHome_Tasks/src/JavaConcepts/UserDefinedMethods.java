package JavaConcepts;

import java.util.Scanner;

public class UserDefinedMethods {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("its a even number");
		}else {
			System.out.println("its a odd number");

		}	
	}
}
