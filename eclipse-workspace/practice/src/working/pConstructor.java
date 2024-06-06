package working;

public class pConstructor {
	int n;
	String name;
	public pConstructor(int i , String j) {
		n = i;
		name = j;
		
	}
	public static void main(String[] args) {
		pConstructor obj = new pConstructor(10, "Fail");
		obj.disc();
		
	}
	void disc() {
		System.out.println( n +name);
	}

}
