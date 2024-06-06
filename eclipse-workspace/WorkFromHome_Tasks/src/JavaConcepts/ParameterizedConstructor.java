package JavaConcepts;


public class ParameterizedConstructor {

	int n;
	String name;
	public ParameterizedConstructor(int i , String j) {
		n = i;
		name = j;
		
	}
	public static void main(String[] args) {
		ParameterizedConstructor obj = new ParameterizedConstructor(10, "Fail");
		obj.disc();
		
	}
	void disc() {
		System.out.println( n +name);
	}

}
