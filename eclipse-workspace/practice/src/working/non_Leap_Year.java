package working;

public class non_Leap_Year {

	public static void main(String[] args) {
		int a = 1999;
		if(a % 4 == 0) {
			if(a % 100 != 0) {
				System.out.println("its a leap year");
			}
		}
		else if( a % 400 == 0) {
			System.out.println("its leap year");
		}
		else {
			System.out.println("non leap year");
		}
	}

}
