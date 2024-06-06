package working;

 abstract class shape {
	
abstract void draw();
}
class circle extends shape{
	
	public static void main(String[] args) {
		shape sc = new circle();
			sc.draw();
	}
	void draw() {
		System.out.println("drawing");
	}

 }
	



