package Types;

public class grandChild extends child2{
	
	int g = (d*f*a) + b;
	String name = "Output comes";
	public static void main(String[] args) {
		
		grandChild ns = new grandChild();
		grandChild vs = new grandChild();
		System.out.println("The value of grand child is:" + ns.g);
		System.out.println("The program of Inheritance are:" + vs.name);
	}

}
