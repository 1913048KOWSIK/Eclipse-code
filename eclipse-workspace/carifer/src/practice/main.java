package practice;

public class main implements Int1,Int2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main sc = new main();
		sc.meth(5);
		sc.meth2(5);
	sc.fun2(26.24f);
		sc.fun(45);
	}
	

	@Override
	public void fun(long a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

	@Override
	public void fun2(float b) {
		// TODO Auto-generated method stub
		System.out.println(b);
	}

	@Override
	public void meth(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

	@Override
	public void meth2(int a) {
		// TODO Auto-generated method stub
	System.out.println(a);	
	}
	

}
