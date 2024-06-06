package practice;
import java . util .Scanner;
public class Condtions {

	public static void main(String[] args) {
	
		int age;
		System.out.println("Enetr the number");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if(age>18) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println(" not Eligible for vote");
		}

	}

}
