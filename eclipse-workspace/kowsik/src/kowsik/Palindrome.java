package kowsik;

import java.util.Scanner;

public class Palindrome {
	public static void min(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int a;
		int s = 0;
		while (n > 0) {
			a = n % 10;
			s = a;
			s++;
			n = n / 10;
		}
		if (temp == s) {
			System.out.println("its palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

}
