package comm.onesoft.day1;

import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int profit = number * 5 / 100 + number;
		System.out.println(profit);
	}

}
