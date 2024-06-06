package Polymorphism;

public class CombinePolmorphismClass {

	public static void main(String[] args) {

		Class_A ks = new Class_A();
		ks.draw();
		ks = new Class_B();
		ks.draw();
		ks = new Class_C();
		ks.draw();
	}

}
