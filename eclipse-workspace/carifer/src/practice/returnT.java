package practice;

public class returnT {
	
	public static float add (float a , float b) {
		float c = a + b;
		System.out.println(c);
		return c;
		
	}
      public static String value(String name) {
    	  return  "kowsik" + name;
    	  
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		returnT obj = new returnT();
		float d = add(25, 30);
		
		String s = value("hi");
		System.out.println(s);
	}

}
