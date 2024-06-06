package practice;

import java.util.Scanner;

public class leap_Year {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter the year");
		Scanner sc = new Scanner (System.in);
		year = sc.nextInt();
		if(year % 4 ==0 && year != 100 || year % 400 == 0) {
			System.out.println("it is leap year");
		}else {
			System.out.println("its not leap year");
		}
	}

	
}