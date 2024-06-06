package workout;

import java.util.Scanner;

public class multiple {
	static long number(long a, long b) {
		return a * b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		long a = sc.nextInt();
		long b = sc.nextInt();
		System.out.println("the values are");
		System.out.println(number(a, b));

	}
}
