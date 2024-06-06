package overRiding;

public class overRiding_Implement implements Interfcae1 , Interface2 {

	

	@Override
	public void function1(String a) {
	
		System.out.println(a);
	}

	@Override
	public void function2(long a, double b, String c) {
		
		System.out.println( a +" "+ b +" " + c);
	}

	@Override
	public void method1(int a) {

		System.out.println(a);
	}

	@Override
	public void method2(int a, float b) {

		System.out.println( a + b);
	}

	
	public static void main(String[] args) {

		 overRiding_Implement sc = new overRiding_Implement();
		 sc.function1("output comes or not");
		 sc.function2(254465646464l,3524.244, "Checking");
		 sc.method1(25);
		 sc.method2(7989, 2465.56f);
	}
}
