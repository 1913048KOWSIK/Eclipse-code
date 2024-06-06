package JavaConcepts;

import java.util.Scanner;

public class ConditionsConcepts {

	public static void main(String[] args) {

		int mark;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		mark = sc.nextInt();

		if( mark < 35) {
			System.out.println("Fail");
		}
		else if(mark >= 35){
			System.out.println("Pass");
		}else if( mark>=90 && mark<80) {
			System.out.println("A grade");
		}
		else if(mark >=80 && mark < 70) {
			System.out.println("B grade");
		}
		else {
			System.out.println("Other are normal");
		}
	}
}
