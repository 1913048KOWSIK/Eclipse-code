package practice;

import java.util.Scanner;

public class userDefinedMehtod {

	public static void main(String[] args) {
	
		 userDefinedMehtod user = new  userDefinedMehtod ();
		 user.display();
		 int a = 10;
		 int b = 30;
			if (a == b || a > b) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			}
	void display() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number:");
		int number = input.nextInt();
		int average;
		average = number / 5;
		System.out.println("the average of number is:" + average);
	}

}
