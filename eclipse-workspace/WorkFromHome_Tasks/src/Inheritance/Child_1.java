package Inheritance;

public class Child_1 extends Parent{

	int c = a+b;
	int d = a*b;
	
	public static void main(String[] args) {
		Child_1 sc = new Child_1();
		System.out.println("The value of c is :" + sc.c);
		System.out.println("The value of d is :" + sc.d);
		
		System.out.println("The value of a is :" + sc.name);

	}
	
}

	