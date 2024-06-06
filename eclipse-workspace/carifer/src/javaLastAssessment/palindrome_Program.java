package javaLastAssessment;

import java.util.Scanner;

public class palindrome_Program {

		public static void main(String[] args) {

			int n;
			System.out.println("Enter the number");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			int temp = n;
			int rev = 0;
			while(n != 0) {
				int rem = n % 10;
				rev = rev * 10 + rem;
				n = n / 10;
				
			}
			if(temp == rev) {
				System.out.println("palindrome");
			}

			else {
				System.out.println("not palindrome");
			}
		}

	}

