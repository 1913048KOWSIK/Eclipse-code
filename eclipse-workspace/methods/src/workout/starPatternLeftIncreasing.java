package workout;

import java.util.Scanner;

public class starPatternLeftIncreasing {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}