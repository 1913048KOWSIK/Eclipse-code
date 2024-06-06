package Test_Program;


import java.util.Scanner;


public class Exercise_5 {

	public static void main(String[] args) {
	
		int Monthnumber;

		int year;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the month number:");

		Monthnumber = sc.nextInt();

		System.out.println("Enter a year:");

		year = sc.nextInt();

	    switch(Monthnumber) {

		case 1:
			System.out.println( "january-" + 31);
			break;

		case 2:
			System.out.println("February-" + 29);
			break;

		case 3:
			System.out.println("march-" + 31);
			break;

		case 4:
			System.out.println("april-" + 30);
			break;

		case 5:
			System.out.println("may-" + 31);
			break;

		case 6:
			System.out.println("june-" + 30);
			break;	

		case 7:
			System.out.println( "july-" + 31);
			break;	

		case 8:
			System.out.println("august-"+ 31);
			break;	

		case 9:
			System.out.println("september-" + 30);
			break;	

		case 10:
			System.out.println("october-" + 31);
			break;	

		case 11:
			System.out.println("november-" + 30);
			break;

		case 12:
			System.out.println("december-" + 31);
			break;

		default:

			System.out.println("entered month not correct");

			}
	}

}
