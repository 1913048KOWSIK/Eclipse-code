package practice;

public class parameterizedConstructor {

		int a ;
		String s;
		public parameterizedConstructor(int i , String name) {
			// TODO Auto-generated constructor stub
			a = i;
			s = name;
		}
		public static void main(String[] args) {
			parameterizedConstructor o1 = new parameterizedConstructor(10, "thala");
			parameterizedConstructor o2 = new parameterizedConstructor(50, "kowsik");
			o1.val();
			o2.val();
		}
		void val() {
			System.out.println(a + s);
		}
}
