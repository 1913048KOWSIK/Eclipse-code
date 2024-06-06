package Encapsulation;

public class A1 {

	private String name ;
	private int age;
	
	public String getNmae() {
		return name;
	}
	
	public void setName(String s) {
		this.name = s;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		this.age=a;
	}
	
	
	public static void main(String[] args) {
		
		A1 ks = new A1();
		ks.setAge(23);
		ks.setName("kowsik");
		
		System.out.println("Age is:" + ks.getAge());
		System.out.println("Nmae is :" + ks.getNmae());
	}
}
