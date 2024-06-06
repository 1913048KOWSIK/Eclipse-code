package workout;

import java.util.Scanner;

public class subraction {
	static int number(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number:");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("the values are");

		System.out.println(number(a, b));
	}
}
