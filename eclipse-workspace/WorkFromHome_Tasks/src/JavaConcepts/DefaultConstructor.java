package JavaConcepts;


public class DefaultConstructor {

	int a ;
	String name ;

	public static void main(String[] args) {
		
		DefaultConstructor obj = new DefaultConstructor();
		obj.disc();
		

}
	void disc() {
		System.out.println( a + name);
	}
}
