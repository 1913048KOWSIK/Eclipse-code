package five_methods;

public class combine_Class implements Class1,Class2,Class3 {

	@Override
	public void value11(char ch) {
		// TODO Auto-generated method stub
		System.out.println("The Character is:" + ch);
	}

	@Override
	public void value12(String d) {
		// TODO Auto-generated method stub
		System.out.println("Strings are:" + d);
	}

	@Override
	public void value13(int a) {
		// TODO Auto-generated method stub
		System.out.println("The value of a" + a);
	}

	@Override
	public void value14(long b) {
		// TODO Auto-generated method stub
		System.out.println("The value of b" + b);
	}

	@Override
	public void value15(double e) {
		// TODO Auto-generated method stub
		System.out.println("The value of e:" + e);
	}

	@Override
	public void value6(double e) {
		// TODO Auto-generated method stub
		System.out.println("The value of e:" + e);
	}

	@Override
	public void value7(String d, int a) {
		// TODO Auto-generated method stub
		System.out.println("Strings are:" + d + " " + a);
	}

	@Override
	public void value8(long b) {
		// TODO Auto-generated method stub
		System.out.println("The value of b" + b);
	}

	@Override
	public void value9(int a, float c) {
		// TODO Auto-generated method stub
		System.out.println("The value of a and c" + a + " " + c);
	}

	@Override
	public void value10(String d) {
		// TODO Auto-generated method stub
		System.out.println("Strings are:" + d);
	}

	@Override
	public void value1(int a) {
		// TODO Auto-generated method stub
		System.out.println("The value of a:" + a);
	}

	@Override
	public void value2(long b, float c) {
		// TODO Auto-generated method stub
		System.out.println("The value of b and c:" + b + " " + c);
	}

	@Override
	public void value3(char ch) {
		// TODO Auto-generated method stub
		System.out.println("the character is:" + ch);
	}

	@Override
	public void value4(String d) {
		// TODO Auto-generated method stub
		System.out.println("The Strings are:" + d);
	}

	@Override
	public void value5(float c, char ch) {
		// TODO Auto-generated method stub
		System.out.println("The value of c and ch" + c + " " + ch);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		combine_Class obj = new combine_Class();
		obj.value1(25);
		obj.value2(365653l, 25.540f);
		obj.value3('K');
		obj.value4("its Working");
		obj.value5(25.540f, 'o');
		obj.value6(4621.4442);
		obj.value7("output comes", 0);
		obj.value8(4641212122l);
		obj.value9(455, 464.44f);
		obj.value10("Overriding");
		obj.value11('w');
		obj.value12("Interface");
		obj.value13(789);
		obj.value14(444334l);
		obj.value15(4555.7866);
		}
}
