package practice;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		float i;
		Scanner sc = new Scanner(System.in);
		i = sc.nextFloat();
		do {
			System.out.println(i);
			i--;
		}
		while(i > 10.0);

	}

}
