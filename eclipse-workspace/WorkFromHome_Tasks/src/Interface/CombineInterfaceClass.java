package Interface;

public class CombineInterfaceClass implements Class_1,Class_2 {

	public static void main(String[] args) {

		CombineInterfaceClass ks = new CombineInterfaceClass();
		ks.method(10);
		ks.method("Carifer");
		ks.method1(20);
		ks.method2(30);
	}

	@Override
	public void method(String name) {
		System.out.println("The name is:" + name);
	}

	@Override
	public void method2(int c) {
		System.out.println("The value of c:" + c);
	}

	@Override
	public void method(int a) {
		System.out.println("The value of a:" + a);
	}

	@Override
	public void method1(int b) {
		System.out.println("The value of b:" + b);
	}


}
