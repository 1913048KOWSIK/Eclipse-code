package working;

 abstract class bike {
	abstract void run();

}
class yamaha extends bike{
	public static void main(String[] args) {
		bike obj = new yamaha();
		obj.run();
	}
	void run() {System.out.println("successful");}
}
