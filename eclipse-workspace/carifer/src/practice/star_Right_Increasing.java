package practice;

import java.util.Scanner;

public class star_Right_Increasing {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number");
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
