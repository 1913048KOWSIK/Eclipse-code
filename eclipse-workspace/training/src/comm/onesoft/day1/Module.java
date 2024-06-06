package comm.onesoft.day1;

import java.util.Scanner;

public class Module {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number are:");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int total = number1 % number2;
		System.out.println("the modules are:" + total);

	}

}
