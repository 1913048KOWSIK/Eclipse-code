package workout;

import java.util.Scanner;

public class starPatternRightDecreasing {

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = n; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
