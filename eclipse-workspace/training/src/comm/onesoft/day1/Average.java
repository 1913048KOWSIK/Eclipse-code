package comm.onesoft.day1;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number:");
		int number = input.nextInt();
		int average;
		average = number / 5;
		System.out.println("the average of number is:" + average);
	}

}
