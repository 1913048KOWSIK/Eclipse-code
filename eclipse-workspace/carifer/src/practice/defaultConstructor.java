package practice;

public class defaultConstructor {

	int a;
	String s ;
public static void main(String[] args) {
	defaultConstructor s1 = new defaultConstructor();
	defaultConstructor s2 = new defaultConstructor();
	s1.disc();
	s2.disc();
}
void disc() {
	System.out.println( a + s);
}
}
