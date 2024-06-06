package practice;

public class return_Type {

	public static float adding(float a, float b){
		float c = a+b;
		System.out.println("adding number :" + " " +c);
		return c;
	
	}
	public static long multiple (long d, long e) {
		long f = d+e;
		System.out.println("multiple number :" + "" + f);
		return f;
	}
public static void main(String[] args) {
	int num1 = 50;
	int num2 = 5;
	return_Type obj = new return_Type();
	float added = obj.adding(num1,  num2);
	long multi = obj.multiple(num1, num2);
	
	System.out.println(added);
	System.out.println(multi);
}
}
