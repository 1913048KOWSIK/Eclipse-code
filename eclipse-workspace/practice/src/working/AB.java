package working;

public class AB implements A,B {
	
	int a = 20;
	int b = 22;
	int c =15;

	@Override
	public void kowsik() {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

	@Override
	public void shalini() {
		// TODO Auto-generated method stub
		System.out.println(b);
	}
	@Override
	public void reshma() {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AB cv = new AB();
		cv.kowsik();
		cv.shalini();
		cv.reshma();
	}

	
}
