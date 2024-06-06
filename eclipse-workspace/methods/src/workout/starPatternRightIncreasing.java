package workout;

import java.util.Scanner;

public class starPatternRightIncreasing {

	public static void main(String[] args) {

		System.out.println("enter the number:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}
